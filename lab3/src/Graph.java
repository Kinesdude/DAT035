import java.util.*;

public class Graph<T>{

	private HashMap<T,Vertex> map;

	public Graph(){
		map = new HashMap<>();
	}

	public void addEdge(T t1, T t2, int weight){
		Vertex v1 = getVertex(t1);
		Vertex v2 = getVertex(t2);
		v1.addAdjacent(v2);
	}

	public void addEdge(Edge e){
		addEdge(e.getFirst(), e.getSecond(), e.getWeight());
	}

	public Vertex getVertex(T t){
		Vertex v = vertex(t);
		if(v == null){
			v = new Vertex<T>(t);
			map.put(t,v);
		}
		return v
	}

	public Vertex vertex(T t){
		return map.get(t); 
	}

	public void resetVertexValues(){
		Iterator<Vertex> vertices = map.values().iterator();
		if(vertices.hashNext()){
			vertices.next().setMaxValue();
		}
	}	
	
}
