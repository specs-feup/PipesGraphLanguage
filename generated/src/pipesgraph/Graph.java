package pipesgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;


public class Graph extends PipeStages{
	private HashMap<String,Component> nodes = new HashMap<String,Component>();
	private PriorityQueue<Component> components = new PriorityQueue<Component>();		
	public Component getComponent(String comp) {return nodes.get(comp);};
	
	public void addEdge(String from, String pfrom, String to, String pto){
		Component csource = nodes.get(from);
		Component ctarget = nodes.get(to);

		ctarget.checkLevel(csource);
	}
	
	public Graph() {
		nodes.put("f1", new FileReader("f1"));
		nodes.get("f1").setGraph(this);			
		components.add(nodes.get("f1"));
		nodes.put("avg1", new Avg("avg1"));
		nodes.get("avg1").setGraph(this);			
		components.add(nodes.get("avg1"));
		nodes.put("sort1", new Sort("sort1"));
		nodes.get("sort1").setGraph(this);			
		components.add(nodes.get("sort1"));
		nodes.put("sort2", new Sort("sort2"));
		nodes.get("sort2").setGraph(this);			
		components.add(nodes.get("sort2"));
		nodes.put("sink1", new Display("sink1"));
		nodes.get("sink1").setGraph(this);			
		components.add(nodes.get("sink1"));
		nodes.put("sink2", new Display("sink2"));
		nodes.get("sink2").setGraph(this);			
		components.add(nodes.get("sink2"));
		nodes.put("sink3", new Display("sink3"));
		nodes.get("sink3").setGraph(this);			
		components.add(nodes.get("sink3"));
		addEdge("f1","avg_in1","avg1","file_out1");
		addEdge("f1","sort_in1","sort1","file_out1");
		addEdge("f1","sort_in1","sort2","file_out1");
		addEdge("avg1","display_in2","sink1","avg_out1");
		addEdge("sort1","display_in1","sink1","sort_out1");
		addEdge("sort1","display_in2","sink2","sort_out2");
		addEdge("sort2","display_in2","sink3","sort_out2");
		
	}
	public void invoke(){
		 for(Component c: components) {
			 c.invoke();
		 }
	}
}

	
