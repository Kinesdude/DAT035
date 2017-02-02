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
		this.destination = graph.getVertex(t);
	}

	public void setOrigin(T t){
		this.origin = graph.getVertex(t);
	}

	public int execute(){
		reset();	
		vertexQueue.add(origin);
		origin.setValue(0);
		while(vertexQueue.peek() != destination){
			handleVertex(vertexQueue.poll());			
		}
		return destination.getValue();
	}

	public void handleVertex(Vertex v){
		Iterator<Vertex> vertexIterator =  v.getAdjacentIterator(); 
		Iterator<Integer> weightIterator = v.getWeightIterator();

		//--debugger--
		System.out.println("Main vertex: " + v.get());
		//--debugger--

		while(vertexIterator.hasNext()){
			Vertex v2 = vertexIterator.next();	
			int weight = v.getValue() + weightIterator.next();
			
			//--debugger--
			System.out.println("Ajacent node: " + v2.get());
			
			//--debugger--

			if(!visitedVertices.contains(v2) && weight < v2.getValue()){
				v2.setPredecessor(v);
				vertexQueue.add(v2);
				v2.setValue(weight);
			}	
		}
		visitedVertices.add(v);
	}

}
