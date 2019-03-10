package exercise4;

import exercise3.BankAccount;

public class NitFlux {

	String email;
	int sub;
	double fee;
	String name;
	String code;
	BankAccount account = new BankAccount(name, code);
	
	NitFlux(String email, int subscription, double fee, BankAccount account)
	{
		this.email = email;
		this.sub = subscription;
		this.fee = fee;
		this.account = account;
	}
	
}
