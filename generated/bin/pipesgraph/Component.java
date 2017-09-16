package pipesgraph;
import java.util.HashMap;

public abstract class Component extends PipeStages implements Comparable<Component>{
	protected int level = 0;
	protected String name;
	Runnable call;
	Runnable assign;
	protected Graph graph;
	public Graph getGraph(){return graph;};
	public void setGraph(Graph g){graph=g;};
	protected HashMap<String, Port> inPorts = new HashMap<String, Port>();
	protected HashMap<String, Port> outPorts = new HashMap<String, Port>();				
	public Port getPort(String name){
		if(inPorts.get(name) != null) 
			return inPorts.get(name);
			return outPorts.get(name);
	}
	public int getLevel() {
		return level;
	}
	public void checkLevel(Component c){
		if(level<c.getLevel())
			level = c.getLevel()+1;
	}
	public int compareTo(Component c) {
		return Integer.compare(this.level, c.getLevel());
	}
	public void invoke(){
		assign.run();
		call.run();
	}
	public void setCall(Runnable r) {
		call=r;
	}
	public String getName(){return name;};
}