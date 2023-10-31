class MatchBox
{
String brand;
int noOfSticks=40;
int length;
double costInRupees;
int size;
int wieghtInGram=30;
String type="wooden Stick";

MatchBox()
	{
		System.out.println("MatchBox created");
	}
	
MatchBox(String brand)
	{
		this.brand=brand;
		System.out.println("MatchBox with brand :"+brand);
	}
MatchBox(int noOfSticks,String brand)
	{
		this.noOfSticks=noOfSticks;
		this.brand=brand;
		System.out.println("MatchBox with noOfStick  and barnd :"+noOfSticks+","+brand);
	}
MatchBox(int length,int wieghtInGram)
	{
		this.length=length;
		this.wieghtInGram=wieghtInGram;
		System.out.println("MatchBox with length and wieghtInGram:"+length+","+wieghtInGram);
	}
MatchBox(double cost)
	{
		this.costInRupees=costInRupees;
		System.out.println("MatchBox with cost In Rs :"+costInRupees);
	}
MatchBox(int size)
	{
		this.size=size;
		System.out.println("MatchBox with size :"+size);
	}	
MatchBox(String type,int wieght)
	{
		this.type=type;
		this.wieghtInGram=wieghtInGram;
		System.out.println("MatchBox with type and weight :"+type+","+wieghtInGram);
	}	
}