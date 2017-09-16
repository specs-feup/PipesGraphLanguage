package pipesgraph;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Sort extends Filter{
private int[] sort_in1;
public int[] getsort_in1() {return sort_in1;};
public void setsort_in1(int[] val) {sort_in1 = val;};
private int[] sort_out1;
public int[] getsort_out1() {return sort_out1;};
public void setsort_out1(int[] val) {sort_out1 = val;};
private long sort_out2;
public long getsort_out2() {return sort_out2;};
public void setsort_out2(long val) {sort_out2 = val;};
public Sort(String name){
	this.name=name;
	switch (name) {
	case "sort2":
	call = () -> {
		long start = System.nanoTime();
		boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < sort_in1.length - j; i++) {
	            if (sort_in1[i] > sort_in1[i + 1]) {
	                tmp = sort_in1[i];
	                sort_in1[i] = sort_in1[i + 1];
	                sort_in1[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	    sort_out2 = (System.nanoTime() - start);
		sort_out1 = sort_in1;
		};
	break;
	default:
	call = () -> {
		long start = System.nanoTime();
		Arrays.sort(sort_in1);
		sort_out2 = (System.nanoTime() - start);
		sort_out1 = sort_in1;
		};
	break;}
	switch (name) {
	case "sort1":
	assign = () -> {
		sort_in1 = ((FileReader)graph.getComponent("f1")).getfile_out1();
	};
	break;
	case "sort2":
	assign = () -> {
		sort_in1 = ((FileReader)graph.getComponent("f1")).getfile_out1();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}

	}

}