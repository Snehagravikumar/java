class HelmetTrainee
{
public static void main(String[] args)
{
	System.out.println("Start main in HelmetTrainee... ");
	
	Helmet helmet=new Helmet();
	System.out.println("Helmet brand :"+helmet.brand);
	System.out.println("Helmet type :"+helmet.type);
	System.out.println("Helmet cost :"+helmet.cost);
	System.out.println("Helmet color :"+helmet.color);
	System.out.println("Helmet size :"+helmet.size);
	
	System.out.println("######################################");

	Helmet helmet1=new Helmet("Vega","half",250);
	System.out.println("Helmet brand :"+helmet1.brand);
	System.out.println("Helmet type :"+helmet1.type);
	System.out.println("Helmet cost :"+helmet1.cost);
	System.out.println("Helmet color :"+helmet1.color);
	System.out.println("Helmet size :"+helmet1.size);
	
	System.out.println("######################################");

	Helmet helmet2=new Helmet("Vega","full",1000,"black");
	System.out.println("Helmet Model :"+helmet2.brand);
	System.out.println("Helmet capacity :"+helmet2.type);
	System.out.println("Helmet cost :"+helmet2.cost);
	System.out.println("Helmet brand :"+helmet2.color);
	System.out.println("Helmet noOfPages :"+helmet2.size);
	
	System.out.println("######################################");

	Helmet helmet3=new Helmet("Vega","full",1000,"white",150);
	System.out.println("Helmet brand :"+helmet3.brand);
	System.out.println("Helmet type :"+helmet3.type);
	System.out.println("Helmet cost :"+helmet3.cost);
	System.out.println("Helmet color :"+helmet3.color);
	System.out.println("Helmet size :"+helmet3.size);
	
	System.out.println("######################################");
		
	Helmet helmet4=new Helmet("Vega","full",1000,"white",150);
	System.out.println("Helmet brand :"+helmet4.brand);
	System.out.println("Helmet type :"+helmet4.type);
	System.out.println("Helmet cost :"+helmet4.cost);
	System.out.println("Helmet color :"+helmet4.color);
	System.out.println("Helmet size :"+helmet4.size);
	
	
	System.out.println("End main in PrinterTrainee... ");
}
}