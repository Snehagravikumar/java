class City
{
	String name;
	String stateName;
	
	City(String name,String stateName)
	{
		this.name=name;
		this.stateName=stateName;
	}
	void displayCity()
	{
		System.out.println("Display City");
		System.out.println("City Name :"+this.name);
	    System.out.println("City State Name :"+this.stateName);

	}
}