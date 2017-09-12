package pipesgraph;
import java.util.ArrayList;

public class Port{
	protected Component component;
	protected String name;
	protected ArrayList<Edge> edges = new ArrayList<Edge>();

	public Port(String name, Component component){
		this.name = name;
		this.component = component;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	public void addEdge(Edge edge){
		this.edges.add(edge);
	}
}
