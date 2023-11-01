class Clock
{
	 String shape;
	 String name;
	 double cost;
	 String type;
	 
	 
	 Clock()
	 {
		super(); 
	 }
	 
	  Clock(String shape)
	 {
		 super();
		 this.shape=shape;
		 System.out.println("Clock with shape :"+shape);
	 }
	  Clock(String shape,String name)
	 {
		 super();
		 this.shape=shape;
		 this.name=name;
		 System.out.println("Clock with shape and name :"+shape+","+name);
		 
	 }
	  Clock(String shape,String name, double cost)
	 {
		 this.shape=shape;
		 this.name=name;
		 this.cost=cost;
		 System.out.println("Clock with shape,name and cost :"+shape+","+name+","+cost);
	 }
	  Clock(String shape,String name, double cost,String type)
	 {
		 super();
		 this.shape=shape;
		 this.name=name;
		 this.cost=cost;
		 this.type=type;
		 System.out.println("Clock with shape,name,cost and type :"+shape+","+name+","+cost+","+type);
	 }
	 
}