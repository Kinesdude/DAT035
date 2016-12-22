public class Bid{
	private String name;
	private int price;

	public Bid(String name, int price){
		this.name = name;
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

	public String getName(){
		return name;
	}

}
