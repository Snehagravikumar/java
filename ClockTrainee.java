class ClockTrainee
{

public static void main(String[] clocks)
{
	System.out.println("Start main in ClockTrainee");
	Clock clock=new Clock();
	System.out.println("Clock Shape :"+clock.shape);
	System.out.println("Clock Name :"+clock.name);
	System.out.println("Clock Cost :"+clock.cost);
	System.out.println("Clock Type :"+clock.type);
	
	System.out.println("==============================");
	
    Clock clock1=new Clock("Heart");
	System.out.println("Clock Shape :"+clock1.shape);
	System.out.println("Clock Name :"+clock1.name);
	System.out.println("Clock Cost :"+clock1.cost);
	System.out.println("Clock Type :"+clock1.type);
	
	System.out.println("==============================");

	
	Clock clock2=new Clock("square","Quartz");
	System.out.println("Clock Shape :"+clock2.shape);
	System.out.println("Clock Name :"+clock2.name);
	System.out.println("Clock Cost :"+clock2.cost);
	System.out.println("Clock Type :"+clock2.type);
	
	System.out.println("==============================");

	Clock clock3=new Clock("square","Ajantha",500);
	System.out.println("Clock Shape :"+clock3.shape);
	System.out.println("Clock Name :"+clock3.name);
	System.out.println("Clock Cost :"+clock3.cost);
	System.out.println("Clock Type :"+clock3.type);
	
	System.out.println("==============================");

	Clock clock4=new Clock("Circle","Fastrac",1500,"Digital");
	System.out.println("Clock Shape :"+clock4.shape);
	System.out.println("Clock Name :"+clock4.name);
	System.out.println("Clock Cost :"+clock4.cost);
	System.out.println("Clock Type :"+clock4.type);
	
	System.out.println("End main in ClockTrainee");

}

}