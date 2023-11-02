class Bracelet
{
    String design;
	String meterial;
	int size;
	double cost;
	double wieght;
	
	Bracelet()
	{
		this("Beats","gold",5,40000,5.5);
	}
    Bracelet(String design,String meterial,int size)
	{
		this.design=design;
		this.meterial=meterial;
		this.size=size;
	System.out.println("Bracelet with design,meterial and size :"+design+","+meterial+","+size);
		
	}
	Bracelet(String design,String meterial,int size,double cost)
	{
		this(design,meterial,size);
		this.cost=cost;
	System.out.println("Bracelet with design,meterial,size and cost :"+design+","+meterial+","+size+","+cost);

	}
	Bracelet(String design,String meterial,int size,double cost,double wieght)
	{
		this(design,meterial,size,cost);
		this.wieght=wieght;
	System.out.println("Bracelet with design,meterial,size,cost and wieght:"+design+","+meterial+","+size+","+cost+","+wieght);
	
	}

}