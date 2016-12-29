import java.util.*;

public class Main{
	public static void main(String[] args){	
		Bid bid1 = new Bid("a","K",1);
		Bid bid2 = new Bid("c","K",3);
		Bid bid3 = new Bid("d","K",4);
		Bid bid4 = new Bid("A","K",8);
		Bid bid5 = new Bid("k","K",6);
		Bid bid6 = new Bid("n","K",5);
		Bid bid7 = new Bid("j","K",8);
		Bid bid8 = new Bid("m","K",9);
		Bid bid9 = new Bid("m","K",9);
		Bid bid10 = new Bid("ko","K",10);
		PriorityQueue<Bid> queue = new PriorityQueue<>(new SellerComparator());
		//PriorityQueue<Bid> queue = new PriorityQueue<>(new BuyerComparator());
		queue.add(bid1);
		queue.add(bid2);
		queue.add(bid3);
		queue.add(bid4);
		queue.add(bid5);
		queue.add(bid6);
		queue.add(bid7);
		queue.add(bid8);
		queue.add(bid9);
		
		printBidHeapArray(queue.getArray());

		System.out.println("Replace 1 by 10: ");
		queue.replace(new Bid(bid1),bid10);

		printBidHeapArray(queue.getArray());

		System.out.println("Tar bort första: ");

		queue.poll();

		printBidHeapArray(queue.getArray());






		System.out.println("Size: " + queue.getSize());
		System.out.println("Index: " + queue.index(bid10));
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();
		System.out.println(queue.peek().getName());
		queue.poll();


	}

	public static void printBidHeapArray(ArrayList<Bid> bids){

		System.out.println("Printing heap array:");

		int downShift = 1;
		for(int i = 1 ; i < bids.size() ; i++){
			if(i == downShift){
				downShift *= 2;
				System.out.println();
			}
			System.out.print(bids.get(i).getPrice() + " ");
		}
		System.out.println();
	}

}
