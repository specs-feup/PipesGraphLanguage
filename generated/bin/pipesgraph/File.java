package pipesgraph;

public class File extends Source{
private int[] file_out1;
public int[] getfile_out1() {return file_out1;};
public void setfile_out1(int[] val) {file_out1 = val;};
private int file_out2;
public int getfile_out2() {return file_out2;};
public void setfile_out2(int val) {file_out2 = val;};
	public File(String name){
		this.name=name;
		switch (name) {
		default:
		call = () -> {
			Scanner s = new Scanner((Readable) new File("input.txt"));
			file_out1 = new int[s.nextInt()];
			file_out2 = file_out1.length;
			for (int i = 0; i < file_out1.length; i++)
		   	file_out1[i] = s.nextInt();
		   	s.close();
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
		outPorts.put("file_out1", new Port("file_out1",this));
		outPorts.put("file_out2", new Port("file_out2",this));
	}

} 