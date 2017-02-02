import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex>{
	
	public int compare(Vertex v1, Vertex v2){
		return v1.getValue() - v2.getValue();
	}

}
