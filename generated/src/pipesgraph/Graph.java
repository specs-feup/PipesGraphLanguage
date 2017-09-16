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
		nodes.put("f1", new File("f1"));
		nodes.get("f1").setGraph(this);			
		components.add(nodes.get("f1"));
		nodes.put("f2", new File("f2"));
		nodes.get("f2").setGraph(this);			
		components.add(nodes.get("f2"));
		nodes.put("filter1", new Avg("filter1"));
		nodes.get("filter1").setGraph(this);			
		components.add(nodes.get("filter1"));
		nodes.put("filter2", new Avg("filter2"));
		nodes.get("filter2").setGraph(this);			
		components.add(nodes.get("filter2"));
		nodes.put("sort1", new Sort("sort1"));
		nodes.get("sort1").setGraph(this);			
		components.add(nodes.get("sort1"));
		nodes.put("sink1", new Display("sink1"));
		nodes.get("sink1").setGraph(this);			
		components.add(nodes.get("sink1"));
		nodes.put("show2", new Display("show2"));
		nodes.get("show2").setGraph(this);			
		components.add(nodes.get("show2"));
		addEdge("f1","avg_in1","filter1","file_out1");
		addEdge("f2","sort_in1","sort1","file_out2");
		addEdge("f2","avg_in2","filter1","file_out1");
		addEdge("filter1","avg_in1","filter2","avg_out2");
		addEdge("filter1","display_in1","sink1","avg_out1");
		addEdge("filter2","display_in1","show2","avg_out1");
		addEdge("sort1","avg_in2","filter2","sort_out1");
		
	}
	public void invoke(){
		 for(Component c: components) {
			 c.invoke();
		 }
	}
}

	
