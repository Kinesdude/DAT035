import java.util.*;


//dont forget to compare Edges it between same vertices and different weights

public class Graph<T>{

	private HashMap<T,Vertex> map;

	public Graph(){
		map = new HashMap<>();
	}

	public void addEdge(T t1, T t2, int weight){
		Vertex v1 = getVertex(t1);
		Vertex v2 = getVertex(t2);
		v1.addAdjacent(v2,weight);
	}

	public void addEdge(Edge<T> e){
		addEdge(e.getFirst(), e.getSecond(), e.getWeight());
	}

	public Vertex getVertex(T t){
		Vertex v = vertex(t);
		if(v == null){
			v = new Vertex<T>(t);
			map.put(t,v);
		}
		return v;
	}

	public Vertex vertex(T t){
		return map.get(t); 
	}

	public void resetVertexValues(){
		Iterator<Vertex> it= map.values().iterator();
		while(it.hasNext()){
			//--Debugger
			//System.out.println("Resetting value in graph: ");
			//--Debugger

			Vertex v = it.next();
			v.setMaxValue();
			//v.setPredecessor(null);
			//reset.amount.of.edges!for iterator backwards compability
		}
	}	
	
}
