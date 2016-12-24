import java.util.*;

public class Main{
	public static void main(String[] args){	
		Bid bid1 = new Bid("a",1);
		Bid bid2 = new Bid("b",2);
		Bid bid3 = new Bid("c",3);
		PriorityQueue<Bid> queue = new PriorityQueue<>(new SellerComparator());
		queue.add(bid1);
		queue.add(bid2);
		queue.add(bid3);
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());

	}
}
