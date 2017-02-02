import java.util.*;

public class Dijkstra<T>{

	private Graph<T> graph;
	private PriorityQueue<Vertex> vertexQueue;
	private HashSet<Vertex> visitedVertices;
	
	private Vertex<T> origin;
	private Vertex<T> destination;

	public Dijkstra(Graph<T> graph){
		this.graph = graph;
		this.vertexQueue = new PriorityQueue(11, new VertexComparator());
		this.visitedVertices = new HashSet();
	}

	public void reset(){
		graph.resetVertexValues();
		vertexQueue.clear();	
		visitedVertices.clear();
	}	

	public void setDestination(T t){
		this.destination = new Vertex<T>(t);
	}

	public void setOrigin(T t){
		this.origin = new Vertex<T>(t);
	}

	public int execute(){
		reset();	
		vertexQueue.add(origin);
		origin.setValue(0);
		while(vertexQueue.peek() != destination){
			handleVertex(vertexQueue.poll());			
		}
		//reset();
		return destination.getValue();
	}

	public void handleVertex(Vertex v){
		Iterator<Vertex> vertexIterator =  v.getAdjacentIterator(); 
		Iterator<Integer> weightIterator = v.getWeightIterator();

		while(vertexIterator.hasNext()){
			Vertex v2 = vertexIterator.next();	
			int weight = v.getWeight() + weightIterator.next();
			if(!visitedVertices.contains(v2) && weight < v2.getWeight()){
				//set predecessor
				//add to v2 to queue
				//set weight	
			}	
			//Jämföra nya och gamla
			//ifall, sätt nya värde och predecessor	
		}
		visitedVertices.add(v);
	}

}
