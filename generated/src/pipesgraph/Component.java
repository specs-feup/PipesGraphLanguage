package pipesgraph;
import java.util.HashMap;

public abstract class Component extends PipeStages implements Comparable<Component>{
	protected int level = 0;
	protected String name;
	Runnable call;
	Runnable assign;
	protected PipesGraph graph;
	public PipesGraph getPipesGraph(){return graph;};
	public void setPipesGraph(PipesGraph g){graph=g;};

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