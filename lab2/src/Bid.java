public class Bid{
	private String name;
	private int price;
	private Integer oldPrice;

	public Bid(Bid bid){
		this(bid.getName(),bid.getPrice());				
	}

	public Bid(String name, int price){
		this(name,null,price);
	}

	public Bid(String name, Integer oldPrice, int price){
		this.name = name;
		this.price = price;
		this.oldPrice = oldPrice;
	}

	public boolean equals(Object o){
		if(o instanceof Bid){
			Bid bid = (Bid)o;
			return (bid.getName().equals(this.name)  &&  
					bid.getPrice() == this.price);
		}	
		return false;
	}

	public int hashCode(){
		int hashCode = 1;
		hashCode = hashCode * 37 + this.name.hashCode();
		hashCode = hashCode * 41 + this.price;
		return hashCode;
	}

	public int getPrice(){
		return this.price;
	}

	public String getName(){
		return name;
	}
	
	public boolean isNew(){
		return this.oldPrice == null;
	}
}
