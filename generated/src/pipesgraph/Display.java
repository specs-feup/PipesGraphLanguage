package pipesgraph;
public class Display extends Sink{

private int display_in1;
public int getdisplay_in1() {return display_in1;};
public void setdisplay_in1(int val) {display_in1 = val;};
	public Display(String name){
	this.name=name;
	switch (name) {
	default:
	call = () -> {System.out.println(display_in1);};
	break;	
	}
	switch (name) {
	case "sink1":
	assign = () -> {
		display_in1 = ((Avg)graph.getComponent("filter1")).getavg_out1();
	};
	break;
	case "show2":
	assign = () -> {
		display_in1 = ((Avg)graph.getComponent("filter2")).getavg_out1();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}
}

}
