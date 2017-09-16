package pipesgraph;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader extends Source{
private int[] file_out1;
public int[] getfile_out1() {return file_out1;};
public void setfile_out1(int[] val) {file_out1 = val;};
private int file_out2;
public int getfile_out2() {return file_out2;};
public void setfile_out2(int val) {file_out2 = val;};
	public FileReader(String name){
		this.name=name;
		switch (name) {
		default:
		call = () -> {
			Scanner s;
			try {
				s = new Scanner(new File("C:\\Users\\Carolina\\Documents\\FEUP\\DSL\\development\\generated\\src\\main\\input.txt"));
				file_out1 = new int[s.nextInt()];
				file_out2 = file_out1.length;
				for (int i = 0; i < file_out1.length; i++)
		 	  	file_out1[i] = s.nextInt();
		 	  	s.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		   	};
		break;					
		}
		switch (name) {
		case "f1":
		assign = () -> {
		};
		break;
		default:
		assign = () -> {};
		break;					
		}					

	}

} 