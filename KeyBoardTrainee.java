class KeyBoardTrainee
{
public static void main(String[] args)
{
System.out.println("Start main in KeyBoardTrainee");

	KeyBoard keyboard=new KeyBoard();
	System.out.println(" KeyBoard Brand :"+keyboard.brand);
	System.out.println(" KeyBoard color :"+keyboard.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard.cost);
	System.out.println(" KeyBoard Type :"+keyboard.type);

System.out.println("*******************************************");

    KeyBoard keyboard1=new KeyBoard("acer");
	System.out.println(" KeyBoard Brand :"+keyboard1.brand);
	System.out.println(" KeyBoard color :"+keyboard1.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard1.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard1.cost);
	System.out.println(" KeyBoard Type :"+keyboard1.type);

System.out.println("*******************************************");

    KeyBoard keyboard2=new KeyBoard("black",83);
	System.out.println(" KeyBoard Brand :"+keyboard2.brand);
	System.out.println(" KeyBoard color :"+keyboard2.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard2.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard.cost);
	System.out.println(" KeyBoard Type :"+keyboard.type);
	
System.out.println("*******************************************");

    KeyBoard keyboard3=new KeyBoard();
	System.out.println(" KeyBoard Brand :"+keyboard.brand);
	System.out.println(" KeyBoard color :"+keyboard.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard.cost);
	System.out.println(" KeyBoard Type :"+keyboard.type);
	
System.out.println("*******************************************");
	
    KeyBoard keyboard4=new KeyBoard("wired");
	System.out.println(" KeyBoard Brand :"+keyboard.brand);
	System.out.println(" KeyBoard color :"+keyboard.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard.cost);
	System.out.println(" KeyBoard Type :"+keyboard.type);

System.out.println("*******************************************");

    KeyBoard keyboard5=new KeyBoard();
	System.out.println(" KeyBoard Brand :"+keyboard.brand);
	System.out.println(" KeyBoard color :"+keyboard.color);
	System.out.println(" KeyBoard No Of Keys :"+keyboard.noOfKeys);
	System.out.println(" KeyBoard Cost :"+keyboard.cost);
	System.out.println(" KeyBoard Type :"+keyboard.type);

System.out.println("End main in KeyBoardTrainee");

}
}