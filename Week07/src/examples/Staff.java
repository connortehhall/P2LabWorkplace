package examples;

public class Staff {

	private StaffMember[] staffList;

	public Staff()
	{
		this.staffList = new StaffMember[6];
		staffList[0] = new Executive("Tony","123 Main Line", "555-0469","123-456-789",2423.07);
		staffList[1] = new Employee("Paulie","456 Off Line","555-0101","987-654-321",1246.15);
		staffList[2] = new Employee("Robin Banks","789 Off Rocker","555-1111","111-222-333",1168.34);
		staffList[3] = new Hourly("Michael","758 Fourth Street","555-0690","945-945-039",10.55);
		staffList[4] = new Volunteer("Andy","123 Bank Blvd","555-8923");
		staffList[5] = new Volunteer("Roy","123 Robbin Blvd","555-1923");

		((Executive) staffList[0]).awardBonus(500);
		((Hourly) staffList[3]).addHours(40);		
	}

	public void payday()
	{
		for(StaffMember staffMember : this.staffList)
		{
			System.out.println(staffMember);
			double amount = staffMember.pay();
			if(amount == 0.0)
			{
				System.out.println("Thanks!");
			}
			else
			{
				System.out.println("Paid: "+amount);
			}
			System.out.println("------------------------------------");
		}

	}
	public static void main(String[] args)
	{
		new Staff().payday();
	}

}
