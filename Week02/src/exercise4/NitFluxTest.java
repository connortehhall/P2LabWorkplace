package exercise4;

import exercise3.BankAccount;

public class NitFluxTest {

	public static void main(String[] args) 
	{
		BankAccount Connor = new BankAccount("Connor", "18016034");
		BankAccount Kyle = new BankAccount("Kyle", "19043525");
		BankAccount Tony = new BankAccount("Tony", "20093246");
		
		NitFlux c1 = new NitFlux("connor@regent.law", 24, 4.99, Connor);
		NitFlux c2 = new NitFlux("kyle@hotmail.co.nz", 12, 6.99, Kyle);
		NitFlux c3 = new NitFlux("tony@gmail.com", 6, 8.99, Tony);
		
		System.out.println(c1.account.name + " (" + c1.account.code + "): " + c1.email + " is paying $" + c1.sub * c1.fee);
		System.out.println(c2.account.name + " (" + c2.account.code + "): " + c2.email + " is paying $" + c2.sub * c2.fee);
		System.out.println(c3.account.name + " (" + c3.account.code + "): " + c3.email + " is paying $" + c3.sub * c3.fee);
		
	}

}
