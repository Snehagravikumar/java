class RocketTrainee
{

public static void main(String[] args)
{
	System.out.println("Start main in RocketTrainee");
	
	Rocket rocket=new Rocket();
	System.out.println("Rocket Name :"+rocket.name);
	System.out.println("Rocket Capacity :"+rocket.capacity);
	System.out.println("Rocket Speed :"+rocket.speed);
	System.out.println("Rocket Engine :"+rocket.engine);

	System.out.println("==============================");
	
	Rocket rocket1=new Rocket("Chandrayana3");
	System.out.println("Rocket Name :"+rocket1.name);
	System.out.println("Rocket Capacity :"+rocket1.capacity);
	System.out.println("Rocket Speed :"+rocket1.speed);
	System.out.println("Rocket Engine :"+rocket1.engine);
	
	System.out.println("==============================");
		
	Rocket rocket2=new Rocket("Chandrayana3",20000);
	System.out.println("Rocket Name :"+rocket2.name);
	System.out.println("Rocket Capacity :"+rocket2.capacity);
	System.out.println("Rocket Speed :"+rocket2.speed);
	System.out.println("Rocket Engine :"+rocket2.engine);

	System.out.println("==============================");
	
	
	Rocket rocket3=new Rocket("Chandrayana3",20000,365000);
	System.out.println("Rocket Name :"+rocket3.name);
	System.out.println("Rocket Capacity :"+rocket3.capacity);
	System.out.println("Rocket Speed :"+rocket3.speed);
	System.out.println("Rocket Engine :"+rocket3.engine);
	
	System.out.println("==============================");
	
	Rocket rocket4=new Rocket("Chandrayana3",20000,365000,"reaction");
	System.out.println("Rocket Name :"+rocket4.name);
	System.out.println("Rocket Capacity :"+rocket4.capacity);
	System.out.println("Rocket Speed :"+rocket4.speed);
	System.out.println("Rocket Engine :"+rocket4.engine);
	
	System.out.println("End main in RocketTrainee");

}
}