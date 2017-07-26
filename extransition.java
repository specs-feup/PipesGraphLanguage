
foreach(Transition trans: transitions){

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