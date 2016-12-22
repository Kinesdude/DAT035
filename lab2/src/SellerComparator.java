public class SellerComparator implements comparator<Bid>{

	public int compare(Bid b1, Bid b2){
		return b2.getPrice()-b1.getPrice();
	}

	public boolean equals(Object obj){
		return false;
	}

}
