package practice2;

public enum Dessert {
	APPLE(100), ICE_CREAM(200), CAKE(300),;

	private int price;

	private Dessert(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	System.out.println(Dessert.APPLE.getPrice());
	System.out.println(Dessert.ICE_CREAM.getPrice());
	System.out.println(Dessert.CAKE.getPrice());
}
