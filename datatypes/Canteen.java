class Canteen
{
	String type;
	String[] utensils;
	
	Canteen(String type)
	{
		this.type=type;
	}
	
	void setUtensil(String[] utensils)
	{
		this.utensils=utensils;
	}
	
	void displayCanteen()
	{
		System.out.println("Start Display Canteen");
		System.out.println("Canteen Type :"+type);
		System.out.println("Canteen Utensils :"+utensils);
		if(utensils!=null)
		{
			for(int uten=0;uten<utensils.length;uten++)
			{
				String values=this.utensils[uten];
				System.out.println("Canteen have "+values+" in index of "+uten);
			}
				
		}
				System.out.println("End Display Canteen");
	}
}