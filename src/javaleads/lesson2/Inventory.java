package javaleads.lesson2;

public class Inventory implements Product {
	public int totalQuantity;
	
	Inventory(){
		this.totalQuantity = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory stock = new Inventory();
		System.out.println(stock.addStock("box", 3));
		System.out.println(stock.addStock("box", 3));
		System.out.println(stock.addStock("box", 3));

	}

	@Override
	public int addStock(String productName, int quantity) {
		this.totalQuantity += quantity;
		return this.totalQuantity;
	}

}
