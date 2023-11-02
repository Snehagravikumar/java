class Printer
{
	String model;
	double capacity;
	int  cost;
	String brand;
	int noOfPages;
	
	Printer()
	{
		this("laser",300,20000,"canon",200);
	}
	
	Printer(String model,double capacity,int cost)
	{
		this.model=model;
		this.capacity=capacity;
		this.cost=cost;
		System.out.println("Printer with model,capacity and cost :"+model+","+capacity+","+cost);
	}
	Printer(String model,double capacity,int cost,String brand)
	{
		this(model,capacity,cost);
		this.brand=brand;	
	System.out.println("Printer with model,capacity,cost and brand :"+model+","+capacity+","+cost+","+brand);

	}
	Printer(String model,double capacity,int cost,String brand,int noOfPages)
	{
		this(model,capacity,cost,brand);
		this.noOfPages=noOfPages;
	System.out.println("Printer with model,capacity,cost and brand :"+model+","+capacity+","+cost+","+brand+","+noOfPages);

	}
}