
interface Source{
	void invoke(); //guarda out
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
previous; //instância e porto?
next;
	String[] out(String[] in);
}
class Sort extends Filter<int[],int[]> {

  @override
	int[] out(int[] in){
	
		return bubble(in);
	}
}

class X {
	int out1;
	int[] out2;
	
	invoke(in0,in1){
	}
}

test = new File();
test.setMethod();
test.setArgs();

test.invoke();

sort.invoke(test.getOut());

//
public class Node<T>{
	List<Port> ins; //HashMap(nome,Port)
	List<Port> out;	
	int level;

}

public class Edge<Port p1,Port p2>{
	Port source; // <n1.get(p1),n2.get(p2)> 
	Port target;
}

public class Port{
	Node node;
	List<Edges> edges;
}
