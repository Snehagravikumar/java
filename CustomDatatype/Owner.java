class Owner
{
	String name="Sneha";
	String email="sneha@gmail.com";
	String permanetAddress;
	String temporaryAddress;
	Address address;
	
	Owner(Address address)
	{
		this.address=address;
	}
	
	void setPermanetTemporary(String permanetAddress,String temporaryAddress)
	
	{
		this.permanetAddress=permanetAddress;
		this.temporaryAddress=temporaryAddress;
		
	}
	
	void displayOwner()
	{
		System.out.println("Start Dispaly Owner");
		System.out.println("Owner Name :"+this.name);
		System.out.println("Owner Email :"+this.email);
		System.out.println("Owner Permanet Address :"+this.permanetAddress);
		System.out.println("Owner Temporary Address :"+this.temporaryAddress);
		System.out.println("Owner Address :"+this.address);
		if(this.address!=null)
		{
			this.address.displayAddress();
		}

		System.out.println("End Dispaly Owner");

	}
}