import java.util.*;
import Lab3Help.*;

public class Lab3{
	public static void main(String[] args){
		Lab3File f = new Lab3File();
		//List<BStop> stops = f.readStops(args[0]);
		List<BLineTable> lines = f.readLines(args[0]);
		
	}

	private List<Edge> edgeAdapter(List<BLineTable> lines){
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
