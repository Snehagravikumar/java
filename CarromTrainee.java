class CarromTrainee
{

public static void main(String[] args)
{
	System.out.println("Start main in CarromTrainee");
	
	Carrom carrom=new Carrom();
	System.out.println("Carrom panColor :"+carrom.panColor);
	System.out.println("Carrom noOfPans :"+carrom.noOfPans);
	System.out.println("Carrom shape :"+carrom.carromShape);
	System.out.println("Carrom cost :"+carrom.cost);
	System.out.println("Carrom noOfPlayers :"+carrom.noOfPlayers);

	System.out.println("######################################");

    Carrom carrom1=new Carrom("black",10,"Rectangle");
	System.out.println("Carrom panColor :"+carrom1.panColor);
	System.out.println("Carrom noOfPans :"+carrom1.noOfPans);
	System.out.println("Carrom shape :"+carrom1.carromShape);
	System.out.println("Carrom cost :"+carrom1.cost);
	System.out.println("Carrom noOfPlayers :"+carrom1.noOfPlayers);

	System.out.println("######################################");

    Carrom carrom2=new Carrom("white",10,"Rectangle",3000);
	System.out.println("Carrom panColor :"+carrom2.panColor);
	System.out.println("Carrom noOfPans :"+carrom2.noOfPans);
	System.out.println("Carrom shape :"+carrom2.carromShape);
	System.out.println("Carrom cost :"+carrom2.cost);
	System.out.println("Carrom noOfPlayers :"+carrom2.noOfPlayers);

	System.out.println("######################################");

    Carrom carrom3=new Carrom("black",10,"Rectangle",3000,4);
	System.out.println("Carrom panColor :"+carrom3.panColor);
	System.out.println("Carrom noOfPans :"+carrom3.noOfPans);
	System.out.println("Carrom shape :"+carrom3.carromShape);
	System.out.println("Carrom cost :"+carrom3.cost);
	System.out.println("Carrom noOfPlayers :"+carrom3.noOfPlayers);

	System.out.println("######################################");

    Carrom carrom4=new Carrom("red",2,"Rectangle",3000,4);
	System.out.println("Carrom panColor :"+carrom4.panColor);
	System.out.println("Carrom noOfPans :"+carrom4.noOfPans);
	System.out.println("Carrom shape :"+carrom4.carromShape);
	System.out.println("Carrom cost :"+carrom4.cost);
	System.out.println("Carrom noOfPlayers :"+carrom4.noOfPlayers);

	
	System.out.println("End main in CarromTrainee");

}
}