import java.util.*;

public class Main{
	public static void main(String[] args){	
		Bid bid1 = new Bid("a",1);
		Bid bid2 = new Bid("c",3);
		Bid bid3 = new Bid("d",4);
		Bid bid4 = new Bid("A",8);
		Bid bid5 = new Bid("k",6);
		Bid bid6 = new Bid("n",5);
		Bid bid7 = new Bid("j",8);
		Bid bid8 = new Bid("m",9);
		PriorityQueue<Bid> queue = new PriorityQueue<>(new BuyerComparator());
		queue.add(bid1);
		queue.add(bid2);
		queue.add(bid3);
		queue.add(bid4);
		queue.add(bid5);
		queue.add(bid6);
		queue.add(bid7);
		queue.add(bid8);
		System.out.println("Size: " + queue.getSize());
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();


	}
}
