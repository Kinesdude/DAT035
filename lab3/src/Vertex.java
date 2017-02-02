import java.util.*;

public class Vertex<T>{
	private LinkedList<Vertex> adjacent;
	private LinkedList<Integer> weights;
	private Vertex predecessor;
	private T t;
	private Integer value;
	//private Integer edges; 
	
	public Vertex(T t){
		this.t = t;
		this.weights = new LinkedList<>();
		this.adjacent = new LinkedList<>(); 
		setMaxValue();
	}

	public void addAdjacent(Vertex v, int weight){
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

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return this.value;
	}

	public void setMaxValue(){
		this.value = Integer.MAX_VALUE;
	}

	public int hashCode(){
		return t.hashCode();
	}

	public boolean equals(Object o){
		if(o == null){
			return false;
		}	

		if( this == o){
			return true;
		}

		if(o instanceof Vertex){
			Vertex v = (Vertex)o;
			return this.t.equals(v.t);
		}
		return false;
	}

}
