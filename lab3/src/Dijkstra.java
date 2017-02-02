import java.utils.*;

public class Dijkstra<T>{

	private Graph<T> graph;
	private PriorityQueue<Vertex> vertexQueue = new PriorityQueue();
	
	private Vertex<T> origin;
	private Vertex<T> destination;

	public Dijkstra(Graph<T> graph){
		this.graph = graph;
	}

	public void setDestination(T t){
		this.destination = new Vertex<T>(t);
	}

	public void setOrigin(T t){
		this.origin = new Vertex<T>(t);
	}

	public int execute(){
			
	}

}
