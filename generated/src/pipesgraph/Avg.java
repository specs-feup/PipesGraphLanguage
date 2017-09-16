package pipesgraph;
public class Avg extends Filter{
private int avg_in1;
public int getavg_in1() {return avg_in1;};
public void setavg_in1(int val) {avg_in1 = val;};
private int avg_in2;
public int getavg_in2() {return avg_in2;};
public void setavg_in2(int val) {avg_in2 = val;};
private int avg_out1;
public int getavg_out1() {return avg_out1;};
public void setavg_out1(int val) {avg_out1 = val;};
private int avg_out2;
public int getavg_out2() {return avg_out2;};
public void setavg_out2(int val) {avg_out2 = val;};
public Avg(String name){
	this.name=name;
	switch (name) {
	default:
	call = () -> {
		avg_out1 = n + avg_in1;
		System.out.println(avg_in1 + " -> " + avg_out1);};
	break;}
	switch (name) {
	case "filter1":
	assign = () -> {
		avg_in1 = ((File)graph.getComponent("f1")).getfile_out1();
		avg_in2 = ((File)graph.getComponent("f2")).getfile_out1();
	};
	break;
	case "filter2":
	assign = () -> {
		avg_in1 = ((Avg)graph.getComponent("filter1")).getavg_out2();
		avg_in2 = ((Sort)graph.getComponent("sort1")).getsort_out1();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}

	}

}