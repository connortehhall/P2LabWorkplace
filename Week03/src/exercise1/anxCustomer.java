package exercise1;

public class anxCustomer {

	private String name;
	private String code;
	
	public anxCustomer(String name, String code)
	{
		this.setCustomerName(name);
		this.setAccountCode(code);
	}

	// --------------------------------------------------------------------
	public void setAccountCode(String code) 
	{
		if (code.equals(""))
		{
			this.code = "UNKNOWN";
		}
		else
		{
			this.code = code;
		}
	}
	
	public String getAccountCode()
	{
		return code;
	}

	// --------------------------------------------------------------------
	public void setCustomerName(String name) 
	{
		if (name.equals(""))
		{
			this.name = "UNKNOWN";	
		}
		else
		{
			this.name = name;
		}
	}
	
	public String getCustomerName()
	{
		return name;
	}
	
	// --------------------------------------------------------------------
	public String toString()
	{
		return "Customer Name: " + name + ", Account Code: " + code;
	}
}
