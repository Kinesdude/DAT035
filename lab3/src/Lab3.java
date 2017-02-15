import java.util.*;
import Lab3Help.*;

public class Lab3{
	public static void main(String[] args){
		Lab3File f = new Lab3File();
		//List<BStop> stops;
		List<BLineTable> lines;
		try{
			//stops = f.readStops(args[0]);
			lines = f.readLines(args[1]);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Graph<String> graph = new Graph(edgeAdapter(lines));
		Path<String> path = new Dijkstra(graph);
		path.computePath(args[2],args[3]);
		System.out.printf("Shortest path: %d", path.getPathLength());
		
	}

	private static List<Edge> edgeAdapter(List<BLineTable> lines){
		Iterator<BLineTable> it = lines.iterator();
		List<Edge> edges = new LinkedList();
		while(it.hasNext()){
			BLineStop[] stops = it.next().getStops();	
			for(int i = 1 ; i < stops.length ; i++){
				edges.add(new Edge(stops[i-1].getName(),
								   stops[i].getName(),
								   stops[i].getTime()));
			}
		}
		return edges;

	}
}
