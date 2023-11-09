class Laptop
{
	Hardware[] hardware;
	Owner owner;
	Brand brand;
	
	Laptop(Hardware[] hardware)
	{
		this.hardware=hardware;
		
	}
	void setOwner(Owner owner)
	{
		this.owner=owner;
	}
	void setBrand(Brand brand)
	{
		this.brand=brand;
	}
	
	void displayLaptop()
	{
		System.out.println("Start Display Laptop");
		System.out.println("Laptop Brand :"+this.brand);
		if(this.brand!=null)
		{
		this.brand.displayBrand();
		}
		System.out.println("Laptop Owner :"+this.owner);
         if(this.owner!=null)
		 {
			 this.owner.displayOwner();
		 }
		 System.out.println("Laptop Hardware :"+this.hardware);
		 if(this.hardware!=null)
		 {
			 for(int hard=0;hard<this.hardware.length;hard++)
			 {
				Hardware values=this.hardware[hard];
				values.displayHardware();
			 }
		 }
          System.out.println("End Display Laptop");
	}
}