public class Bid{
	private String name;
	private int price;
	private int oldPrice;

	public Bid(String name, int price){
		this(name, -1, price);
	}

	public Bid(String name, int oldPrice, int price){
		this.name = name;
		this.price = price;
		this.oldPrice = oldPrice;
	}

	public int getPrice(){
		return this.price;
	}

	public String getName(){
		return name;
	}

}
