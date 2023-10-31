class KeyBoard
{
	String brand;
	String color;
	int noOfKeys=83;
	String type;
	double cost=2000;
	
	KeyBoard()
	{
		System.out.println("keyboard created");
	}
	
	KeyBoard(String brand)
	{
		this.brand=brand;
		System.out.println("keyboard with brand :"+brand);
	}
	KeyBoard(String color,int noOfKeys)
	{
		this.color=color;
		System.out.println("keyboard with color and noOfKeys :"+color+","+noOfKeys);
	}
	KeyBoard(int noOfKeys)
	{
		this.noOfKeys=noOfKeys;
		System.out.println("keyboard with noOfKeys :"+noOfKeys);
	}
	KeyBoard(String type,double cost)
	{
		this.type=type;
		System.out.println("keyboard with type and cost :"+type+","+cost);
	}
	KeyBoard(double cost,String brand)
	{
		this.cost=cost;
		this.brand=brand;
		System.out.println("keyboard with cost and brand :"+cost+","+brand);
	}
}