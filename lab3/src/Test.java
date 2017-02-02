import java.util.*;

public class Test{
	public static void main(String[] args){
		Edge<String> e1 = new Edge("A", "B", 3);
		Edge<String> e2 = new Edge("A", "C", 4);
		Edge<String> e3 = new Edge("B", "D", 5);
		Edge<String> e4 = new Edge("C", "D", 2);
		Edge<String> e5 = new Edge("B", "C", 1);

		Graph<String> graph = new Graph();

		graph.addEdge(e1);
		graph.addEdge(e2);
		graph.addEdge(e3);
		graph.addEdge(e4);
		graph.addEdge(e5);

		Dijkstra<String> dij = new Dijkstra(graph);
		
		dij.setOrigin("A");
		dij.setDestination("D");
		System.out.println(dij.execute());
		System.out.println(dij.execute());
	}
}
