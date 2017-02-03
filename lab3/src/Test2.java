public class Test2{
	public static void main(String[] args){
		Edge<String> e1 = new Edge("A", "B", 1);
		Edge<String> e2 = new Edge("B", "C", 2);
		Edge<String> e3 = new Edge("C", "D", 3);
		Edge<String> e4 = new Edge("D", "E", 4);
		Graph<String> graph = new Graph();
		graph.addEdge(e1);
		graph.addEdge(e2);
		graph.addEdge(e3);
		graph.addEdge(e4);
		Dijkstra<String> dij = new Dijkstra(graph);
		dij.setOrigin("A");
		dij.setDestination("E");
		
		

		dij.execute();
		dij.execute();
	}
}

