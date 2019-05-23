package exercise3;

public class ANXBankAccount {

	private String name;
	private String code;
	private float balance;
	private AccountType type;
	
	ANXBankAccount(String name, String code, float balance, AccountType type)
	{
		this.setName(name);
		this.setCode(code);
		this.setBalance(balance);
		this.setType(type);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
