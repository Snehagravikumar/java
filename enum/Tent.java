class Tent
{
	int slNo;
	TentColor color=TentColor.BLUE;
	double width;
	double height;
	
	Tent(int slNo,TentColor color, double width,double height)
	{
		this.slNo=slNo;
		this.color=color;
		this.width=width;
		this.height=height;
	}
	
	boolean open()
	{
		System.out.println("Tent Open");
		return true;
	}
	boolean close()
	{
		System.out.println("Tent Close");
		return false;
	}
	void displayTent()
	{
		System.out.println("Start Display Tent");
		System.out.println("Display Tent slNo :"+this.slNo);		
		System.out.println("Display Tent color :"+this.color);
        System.out.println("Display Tent width :"+this.width);
	    System.out.println("Display Tent height :"+this.height);
	}
}