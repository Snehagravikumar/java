class Rocket
{
  String name;
  double capacity;
  long speed;
  String engine;
  
  
  Rocket()
  {
	  super();
  }
 Rocket(String name)
  {
	 super();
    this.name=name;	
	  System.out.println("Rocket with name :"+name);
	
  }
 Rocket(String name,double capacity)
  {
	 super();
    this.name=name;
    this.capacity=capacity;	
		  System.out.println("Rocket with name and capacity :"+name+","+capacity);

  }
 Rocket(String name,double capacity,long speed)
  {
	  this.name=name;
	  this.capacity=capacity;
	  this.speed=speed;
	  	  System.out.println("Rocket with name,capacity and speed :"+name+","+capacity+","+speed);

  }
 Rocket(String name,double capacity,long speed,String engine)
  {
	  this.name=name;
	  this.capacity=capacity;
	  this.speed=speed;
	  this.engine=engine;
	  System.out.println("Rocket with name,capacity,speed and engine :"+name+","+capacity+","+speed+","+engine);
  }


}