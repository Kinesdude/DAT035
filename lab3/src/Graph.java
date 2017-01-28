import java.util.*;

public class Graph<T>{

	private HashMap<T,Vertex> map;

	public Graph(){
		map = new HashMap<>();
	}

	public void addEdge(T t1, T t2, int weight){
		addVertex(t1);
		addVertex(t2);
		map.get(t1).addEdge(map.get(t2),weight);
	}

	public void addVertex(T t){
		if(map.get(t) == null){
			map.put(t, new Vertex());
		}
	}


	public Vertex vertex(T t){
		return map.get(t); 
	}

}
