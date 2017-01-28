import java.util.*;

public class Vertex<T>{
	private LinkedList<Vertex> adjacent;
	private LinkedList<Integer> weights;
	private Vertex predecessor;
	private T t;
	private Integer value;
	
	public Vertex(T t){
		this.t = t;
		this.lengths = new LinkedList<>();
		this.adjacent = new LinkedList<>(); 
		this.value = Integer.MAX_VALUE;		
	}

	public void addEdge(Vertex v, int weight){
		adjacent.add(v);	
		weights.add(weight);
	}

	public Vertex getPredecessor(){
		return this.predecessor;
	}

	public void setPredecessor(Vertex v){
		this.predecessor = v;
	}

	public ListIterator<Vertex> getAdjacentIterator(){
		return adjacent.listIterator();
	}	

	public ListIterator<Integer> getWeightsIterator(){
		return weights.listIterator();
	}

	public T get(){
		return this.t;
	}

	public int hashCode(){
		return t.hashCode();
	}

}
