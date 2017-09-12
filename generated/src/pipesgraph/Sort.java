package pipesgraph;
public class Sort extends Filter{
private int sort_in1;
public int getsort_in1() {return sort_in1;};
public void setsort_in1(int val) {sort_in1 = val;};
private int sort_out1;
public int getsort_out1() {return sort_out1;};
public void setsort_out1(int val) {sort_out1 = val;};
public Sort(String name){
	this.name=name;
	switch (name) {
	default:
	call = () -> {System.out.println("print from sink1");};
	break;}
	switch (name) {
	case "sort1":
	assign = () -> {
		sort_in1 = ((File)graph.getComponent("f2")).getfile_out2();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}
	inPorts.put("sort_in1", new Port("sort_in1",this));
	outPorts.put("sort_out1", new Port("sort_out1",this));
	}

}