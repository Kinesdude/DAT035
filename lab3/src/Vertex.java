import java.util.*;

public class Vertex<T>{
	private LinkedList<Vertex> adjacent;
	private LinkedList<Integer> lengths;
	private Vertex predecessor;
	private T t;
	
	public Vertex(T t){
		this.t = t;
		this.lengths = new LinkedList<>();
		this.adjacent = new LinkedList<>(); 
	}

	public int hashCode(){
		return t.hashCode();
	}

	public Vertex getPredecessor(){
		return this.predecessor;
	}

	public void setPredecessor(Vertex v){
		this.predecessor = v;
	}

	public ListIterator<Vertex> getIterator(){
		return adjacent.listIterator();
	}	
}
