class Resturant
{
	String ownerName="Sneha";
	String[] specialItems;
	
	Resturant()
	{
		System.out.println("Created no argument constructor for Resturant");
		
	}
	
	void setSpecialItems(String[] specialItems)
	{
		this.specialItems=specialItems;
		
	}
	
	void displayResturant()
	{
		System.out.println("Start Display Resturant");
		System.out.println("Resturant Name :"+ownerName);
		System.out.println("Resturant SpecialItems "+specialItems);
		if(this.specialItems!=null)
		{
			for(int items=0;items<this.specialItems.length;items++)
			{
	         String ref=this.specialItems[items];
			 System.out.println("Resturant is "+ref+" in the index "+items);
			}
		}
		System.out.println("End Display Resturant");
		
	}
	
}