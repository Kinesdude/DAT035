import java.util.Comparator;

public class SellerComparator implements Comparator<Bid>{

	public int compare(Bid b1, Bid b2){
		return b2.getPrice()-b1.getPrice();
	}

	public boolean equals(Object obj){
		return false;
	}

}
