package pipesgraph;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Avg extends Filter{
private int[] avg_in1;
public int[] getavg_in1() {return avg_in1;};
public void setavg_in1(int[] val) {avg_in1 = val;};
private int avg_in2;
public int getavg_in2() {return avg_in2;};
public void setavg_in2(int val) {avg_in2 = val;};
private long avg_out1;
public long getavg_out1() {return avg_out1;};
public void setavg_out1(long val) {avg_out1 = val;};
private int avg_out2;
public int getavg_out2() {return avg_out2;};
public void setavg_out2(int val) {avg_out2 = val;};
public Avg(String name){
	this.name=name;
	switch (name) {
	default:
	call = () -> {
		for(int i = 0; i<avg_in1.length;i++)
		 avg_out1 += avg_in1[i];
		avg_out1 = avg_out1/avg_in1.length;
		};
	break;}
	switch (name) {
	case "avg1":
	assign = () -> {
		avg_in1 = ((FileReader)graph.getComponent("f1")).getfile_out1();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}

	}

}