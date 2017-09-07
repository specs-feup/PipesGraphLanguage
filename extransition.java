
foreach(Transition trans: transitions){
// trans = <component,port>?
  Transition current = trans;
  generate(current.source);
  while(current.target == null){
     previous = current;
	 current = current.transition;
	 //verify conversions
	generate(current.source, previous.source); 
  }
  //verify conversions
  generate(current.target, current.source);
}


generate(Instance current){
  code = current.name+".invoke();"
}


generate(Instance current, Instance previous){
  code = current.name+".invoke("+previous.name+".getOut());"
}
//////

«IF (component instanceof Source)»
				public class «component.name» extends Source{
					public «component.name»(String name){
						this.name=name;
						«FOR port : component.outPorts»
							inPorts.put(«port.name», new Port(«port.name»,this));
						«ENDFOR»
					}
				}
			«ELSEIF (component instanceof Filter)»
				public class «component.name» extends Filter{
					public «component.name»(String name){
						this.name=name;
						«FOR port : component.inPorts»
							inPorts.put(«port.name», new Port(«port.name»,this));
						«ENDFOR»
						«FOR port : component.outPorts»
							outPorts.put(«port.name», new Port(«port.name»,this));
						«ENDFOR»					
					}
				}
			«ELSEIF (component instanceof Sink)»
				public class «component.name» extends Sink{
					public «component.name»(String name){
						this.name=name;
						«FOR port : component.outPorts»
							outPorts.put(«port.name», new Port(«port.name»,this));
						«ENDFOR»					
					}					
				}
			«ENDIF»			
		«ENDFOR»