package pipesgraph;
public class Edge{
	protected Port source; // <n1.get(p1),n2.get(p2)> 
	protected Port target;

	public Edge(Port source, Port target){
		this.source = source;
		this.target = target;
	}

	public Port getSource() {
		return source;
	}

	public void setSource(Port source) {
		this.source = source;
	}

	public Port getTarget() {
		return target;
	}

	public void setTarget(Port target) {
		this.target = target;
	}
}
