import Lab3Help.*;
import java.util.*;

public class Dijkstra<T> implements Path<T>{

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
		this.graph.resetVertexValues();
		this.vertexQueue.clear();	
		this.visitedVertices.clear();
	}	

	private void setDestination(T t){
		this.destination = graph.getVertex(t);
	}

	private void setOrigin(T t){
		this.origin = graph.getVertex(t);
	}

	public void computePath(T from, T to){
		setOrigin(from);
		setDestination(to);
		reset();	
		vertexQueue.add(this.origin);
		this.origin.setValue(0);
		while(vertexQueue.peek() != destination){
			handleVertex(vertexQueue.poll());			
		}
	}

	public void handleVertex(Vertex v){
		Iterator<Vertex> vertexIterator =  v.getAdjacentIterator(); 
		Iterator<Integer> weightIterator = v.getWeightIterator();

		//--debugger--
		//System.out.println("--Main vertex: " + v.get() + " Value: " + v.getValue());
		//--debugger--

		while(vertexIterator.hasNext()){
			Vertex v2 = vertexIterator.next();	
			int weight = v.getValue() + weightIterator.next();
			
			//--debugger--
			//System.out.println("Ajacent node: " + v2.get() + " Value: " + v2.getValue());
			
			//--debugger--

			if(!visitedVertices.contains(v2) && weight < v2.getValue()){
				//--Debugger
				//System.out.println("Setting new value!");
				//--Debugger
				
				v2.setPredecessor(v);
				vertexQueue.add(v2);
				v2.setValue(weight);
			}	
		}
		visitedVertices.add(v);
	}

	public Iterator<T> getPath(){
		return null;
	}

	public int getPathLength(){
		return this.destination.getValue();
	}
}
