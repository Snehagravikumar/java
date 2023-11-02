class PrinterTrainee
{
public static void main(String[] args)
{
	System.out.println("Start main in PrinterTrainee... ");
	
	Printer printer=new Printer();
	System.out.println("Printer Model :"+printer.model);
	System.out.println("Printer capacity :"+printer.capacity);
	System.out.println("Printer cost :"+printer.cost);
	System.out.println("Printer brand :"+printer.brand);
	System.out.println("Printer noOfPages :"+printer.noOfPages);
	
	System.out.println("######################################");
	
	Printer printer1=new Printer("laser",300,25000);
	System.out.println("Printer Model :"+printer1.model);
	System.out.println("Printer capacity :"+printer1.capacity);
	System.out.println("Printer cost :"+printer1.cost);
	System.out.println("Printer brand :"+printer1.brand);
	System.out.println("Printer noOfPages :"+printer1.noOfPages);
	
		System.out.println("######################################");
	
	Printer printer2=new Printer("Ink-jet",200,10000,"hp");
	System.out.println("Printer Model :"+printer2.model);
	System.out.println("Printer capacity :"+printer2.capacity);
	System.out.println("Printer cost :"+printer2.cost);
	System.out.println("Printer brand :"+printer2.brand);
	System.out.println("Printer noOfPages :"+printer2.noOfPages);
	
		System.out.println("######################################");

	Printer printer3=new Printer("Ink-jet",200,10000,"hp",150);
	System.out.println("Printer Model :"+printer3.model);
	System.out.println("Printer capacity :"+printer3.capacity);
	System.out.println("Printer cost :"+printer3.cost);
	System.out.println("Printer brand :"+printer3.brand);
	System.out.println("Printer noOfPages :"+printer3.noOfPages);
	
		System.out.println("######################################");

	Printer printer4=new Printer("Ink-jet",200,10000,"canon",150);
	System.out.println("Printer Model :"+printer4.model);
	System.out.println("Printer capacity :"+printer4.capacity);
	System.out.println("Printer cost :"+printer4.cost);
	System.out.println("Printer brand :"+printer4.brand);
	System.out.println("Printer noOfPages :"+printer4.noOfPages);
	
	
	System.out.println("End main in PrinterTrainee... ");
}
}