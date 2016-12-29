public class Bid{
	private String name;
	private String operation;
	private int price;
	private Integer oldPrice;

	public Bid(Bid bid){
		this(bid.getName(),bid.getOperation(),bid.getOldPrice());	
	}

	public Bid(String name, String operation, int price){
		this(name,operation,price,null);
	}

	public Bid(String name, String operation, int price, Integer oldPrice){
		this.name = name;
		this.operation = operation;
		this.price = price;
		this.oldPrice = oldPrice;
	}

	public boolean equals(Object o){
		if(o instanceof Bid){
			Bid bid = (Bid)o;
			return (bid.getName().equals(this.name)  &&  
					bid.getPrice() == this.price); //&&
					//bid.getOperation().equals(this.operation) &&
					//bid.getOldPrice().equals();
		}	
		return false;
	}

	public int hashCode(){
		int hashCode = 1;
		hashCode = hashCode * 37 + this.name.hashCode();
		hashCode = hashCode * 43 + this.price;
		//hashCode = hashCode * 41 + this.operation.hashCode();
		//hashCode = hashCode * 47 + this.oldPrice == null ? 0 : this.oldPrice;
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

	public String getOperation(){
		return this.operation;	
	}

	public void printBid(){
		System.out.print(getName() + " " + getPrice());
		
	}

	public int getOldPrice(){
		return this.oldPrice;
	}
}
