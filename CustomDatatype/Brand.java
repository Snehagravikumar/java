class Brand
{
	String name="Lenovo";
	String origin;
	String ceoName;
	String[] cities;
	
	Brand(String[] cities)
	{
		this.cities=cities;
	}
	
	void setOriginCEOName(String origin, String ceoName)
	{
		this.origin=origin;
		this.ceoName=ceoName;
	}
	
	void displayBrand()
	{
		System.out.println("Start Disaplay  Brand");
		System.out.println("Brand Name :"+this.name);
		System.out.println("Brand Origin :"+this.origin);
		System.out.println("Brand CEOName :"+this.ceoName);
		System.out.println("Brand cities :"+this.cities);
		if(this.cities!=null)
		{
			for(int city=0;city<this.cities.length;city++)
			{
			String ref=this.cities[city];
			System.out.println("Brand cities "+ref+" in index "+city);
			}
		}
	    System.out.println("End Disaplay  Brand");

	}
}