class FreeTrainee
{

public static void main (String[]  args)
{
	System.out.println("Start main in FreeTrainee");
	
	Free free=new Free();
	free.displayFree();
	
	System.out.println("**************************");
	
    Free free1=new Free("course","To help Learners",false);
	free1.displayFree();
	
	System.out.println("**************************");

	Free free2=new Free("Food","helps counter poverty",true);
	free2.displayFree();
	
	System.out.println("**************************");

	Free free3=new Free("water","because of summer",true);
	free3.displayFree();
		System.out.println("**************************");

	Free free4=new Free("Juice","To control the triedness and Stress",true);
	free4.displayFree();
		System.out.println("**************************");

	Free free5=new Free("Education","To Socializes Childrens",true);
	free5.displayFree();
		System.out.println("**************************");

	Free free6=new Free("Health Treatment","To help Poor People",true);
	free6.displayFree();
	
	System.out.println("**************************");

	Free free7=new Free("scholarship","For help Students in thier Education",true);
	free7.displayFree();
	
	System.out.println("**************************");

	Free free8=new Free("Laptop","To help Students for thier higher eduaction",false);
	free8.displayFree();
	
	System.out.println("**************************");

	Free free9=new Free("cloth","To Maintain Disciplinity in School",true);
	free.displayFree();
	
	System.out.println("**************************");

	Free free10=new Free("Books","to reduce poverty of poor people",true);
	free10.displayFree();
	
	System.out.println("**************************");

	Free free11=new Free();
	free11.displayFree();
	
	System.out.println("End main in FreeTrainee");
	
}

}