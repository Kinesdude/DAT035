public class Edge<T>{
	private T t1;
	private T t2;
	private int weight;

	public class Edge(T t1, T t2, int weight){
		this.t1 = t1;
		this.t2 = t2;	
		this.weight = weight;
	}

	public T getFirst(){
		return this.t1;
	}

	public T getSecond(){
		return this.t2;
	}

	public int getWeight(){
		return this.weight;	
	}
}
