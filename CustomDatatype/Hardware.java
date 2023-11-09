class Hardware
{
	String name;
	String type;
	Brand brand;
	
	Hardware(Brand brand)
	{
		this.brand=brand;
	}
	
	void setNameAndType(String name, String type)
	{
		this.name=name;
		this.type=type;
	}
	
	void displayHardware()
	{
		System.out.println(" Start Display Hardware");
		System.out.println("Hardware Name :"+this.name);
		System.out.println("Hardware Type :"+this.type);
		System.out.println("End Display Hardware");

	}
}