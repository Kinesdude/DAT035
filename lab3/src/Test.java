import java.util.*;

public class Test{
	public static void main(String[] args){
		PriorityQueue<Vertex> queue = new PriorityQueue(
									  11, new VertexComparator());
		Vertex<String> v1 = new Vertex("abc");
		Vertex<String> v2 = new Vertex("abc1");
		queue.add(v1);
		System.out.println(queue.contains(v1));

		
	}
}
