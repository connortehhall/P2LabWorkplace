package exercise2;

public class BasketApp {

	public static void main(String[] args) 
	{
		Basket basket = new Basket(10);
		Purchase purchase1 = new Purchase("Book", 9.99);
		Purchase purchase2 = new Purchase("Comic", 12.99);
		Purchase purchase3 = new Purchase("Phone", 99.99);
		Purchase purchase4 = new Purchase("Book", 1.99);
		Purchase purchase5 = new Purchase("Chocolate", 3.99);
		
		basket.addPurchase(purchase1);
		basket.addPurchase(purchase2);
		basket.addPurchase(purchase3);
		basket.addPurchase(purchase4);
		basket.addPurchase(purchase5);
		
		System.out.println(basket.getMostExpensive());
		System.out.println(basket.getNPurchases());
		System.out.println(basket.bill());
		basket.getPurchases();
		
	}

}
