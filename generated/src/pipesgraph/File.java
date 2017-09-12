package pipesgraph;

public class File extends Source{
private int file_out1;
public int getfile_out1() {return file_out1;};
public void setfile_out1(int val) {file_out1 = val;};
private int file_out2;
public int getfile_out2() {return file_out2;};
public void setfile_out2(int val) {file_out2 = val;};
	public File(String name){
		this.name=name;
		switch (name) {
		default:
		call = () -> {
			file_out1 = a;
			System.out.println("print from f1: " + file_out1);};
		break;					
		}
		switch (name) {
		case "f1":
		assign = () -> {
		};
		break;
		case "f2":
		assign = () -> {
		};
		break;
		default:
		assign = () -> {};
		break;					
		}					
		outPorts.put("file_out1", new Port("file_out1",this));
		outPorts.put("file_out2", new Port("file_out2",this));
	}

} 