package exercise2;

public class Basket {
	
	private int max;
	private int nPurchases;
	private Purchase[] purchases = new Purchase[10];
	private int count = 0;
	
	public Basket(int max)
	{
		if (max <= 0)
		{
			this.max = 10;
		}
		else
		{
			this.max = max;
		}
	}
	
	public void addPurchase(Purchase purchase)
	{
		if (this.nPurchases <= this.max)
		{
			this.purchases[this.count] = purchase;
			this.count++;
			this.nPurchases++;
		}
		else
		{
			System.out.println("Cart full!");
		}
	}
	
	public int getNPurchases() 
	{
		return this.nPurchases;
	}
	
	public Purchase getMostExpensive() 
	{
		int i = 0;
		Purchase mostArray = this.purchases[i];
		double mostPrice = this.purchases[i].getPrice();
		
		for (i = 1; i < purchases.length; i++)
		{
			if (this.purchases[i] != null && this.purchases[i].getPrice() > mostPrice)
			{
				mostPrice = this.purchases[i].getPrice();
				mostArray = this.purchases[i];
			}
		}
		
		return mostArray;
	}
	
	public double bill()
	{
		double sum = 0.0;
		
		for (int i = 0; i < purchases.length; i++)
		{
			if (this.purchases[i] != null)
			{
				sum += this.purchases[i].getPrice();
		
			}
		}
		
		return sum;
	}
	
	public void getPurchases()
	{
		for (int i = 0; i < this.purchases.length; i++)
		{
			if (this.purchases[i] != null)
			{
				System.out.println(purchases[i].toString());
			}
		}
	}
	
}









