public class BuyerComparator implements Comparator<Bid>{

	public int compare(Bid b1, Bid b2){
		return b1.getPrice()-b2.getPrice();
	}

	public boolean equals(Object obj){
		return false;
	}
	
}
