class Address
{
	String street;
	long pincode=577219;
	City city;
	
	Address(City city)
	{
		this.city=city;
	}
	
	void displayAddress()
	{
		System.out.println("Start Display Address");
		System.out.println("Address street :"+this.street);
		System.out.println("Address pincode :"+this.pincode);
		System.out.println("City :"+this.city);
		if(this.city!=null)
		{
			this.city.displayCity();
		}
		System.out.println("End Display Address");

	}
}