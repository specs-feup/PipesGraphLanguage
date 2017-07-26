
interface Source<O>{
    O getOut();
	void invoke();
}

File extends Source<String[]>{

private String[] out;
	File(){
		this.method = ClassX::readFile;
	}

    @override
	void invoke(){
	out = method(args);
		return ;
	}
	String[] getOut(){
	return out;
	}
}

interface Filter<I,O> {
previous;
next;
	String[] out(String[] in);
}
class Sort extends Filter<int[],int[]> {

  @override
	int[] out(int[] in){
	
		return bubble(in);
	}
}

test = new File();
test.setMethod();
test.setArgs();

test.invoke();

sort.invoke(test.getOut());

//
public class Node<T>{
	List<Port>;
}

public class Edge{
	Node source;
	Node target;
}

public class Port{
	Node node;
	List<Edges>;
}
