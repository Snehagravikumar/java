class MakeupKit
{
	String brand;
	double ratings;
	double cost;
	String items;

	MakeupKit()
	{
		this("Lakme",4.5);
	}
	MakeupKit(String brand)
	{
		this.brand=brand;
		System.out.println("MakeupKit with brand :"+brand);

	}
	MakeupKit(String brand,double ratings)
	{
		this.brand=brand;
		this.ratings=ratings;
		System.out.println("MakeupKit with brand and ratings :"+brand+","+ratings);

	}
	MakeupKit(String brand,double ratings,double cost)
	{
		this.brand=brand;
		this.ratings=ratings;
		this.cost=cost;
	 System.out.println("MakeupKit with brand,ratings and cost :"+brand+","+ratings+","+cost);

	}
	MakeupKit(String brand,double ratings,double cost,String items)
	{
		this.brand=brand;
		this.ratings=ratings;
		this.cost=cost;
		this.items=items;
		System.out.println("MakeupKit with brand,ratings,cost and items :"+brand+","+ratings+","+cost+","+items);
	}
	
}