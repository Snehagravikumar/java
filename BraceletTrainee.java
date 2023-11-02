class BraceletTrainee
{
	public static void main(String[] args)
	{
		
	
		System.out.println("Start main in BraceletTrainee");
		
		Bracelet bracelet=new Bracelet();
		System.out.println("Bracelet design :"+bracelet.design);
		System.out.println("Bracelet meterial :"+bracelet.meterial);
		System.out.println("Bracelet size :"+bracelet.size);
		System.out.println("Bracelet cost :"+bracelet.cost);
		System.out.println("Bracelet wieght :"+bracelet.wieght);

     	System.out.println("######################################");
		
		Bracelet bracelet1=new Bracelet("chain-link","paltinum",4);
		System.out.println("Bracelet design :"+bracelet1.design);
		System.out.println("Bracelet meterial :"+bracelet1.meterial);
		System.out.println("Bracelet size :"+bracelet1.size);
		System.out.println("Bracelet cost :"+bracelet1.cost);
		System.out.println("Bracelet wieght :"+bracelet1.wieght);
		
		System.out.println("######################################");

		Bracelet bracelet2=new Bracelet("plain","gold",5,50000);
		System.out.println("Bracelet design :"+bracelet2.design);
		System.out.println("Bracelet meterial :"+bracelet2.meterial);
		System.out.println("Bracelet size :"+bracelet2.size);
		System.out.println("Bracelet cost :"+bracelet2.cost);
		System.out.println("Bracelet wieght :"+bracelet2.wieght);
		
		System.out.println("######################################");
	
		Bracelet bracelet3=new Bracelet("Beats","gold",4,40000,5.5);
		System.out.println("Bracelet design :"+bracelet3.design);
		System.out.println("Bracelet meterial :"+bracelet3.meterial);
		System.out.println("Bracelet size :"+bracelet3.size);
		System.out.println("Bracelet cost :"+bracelet3.cost);
		System.out.println("Bracelet wieght :"+bracelet3.wieght);
		
		System.out.println("######################################");
	
		Bracelet bracelet4=new Bracelet("Beats","Silver",6,40500,5.5);
		System.out.println("Bracelet design :"+bracelet4.design);
		System.out.println("Bracelet meterial :"+bracelet4.meterial);
		System.out.println("Bracelet size :"+bracelet4.size);
		System.out.println("Bracelet cost :"+bracelet4.cost);
		System.out.println("Bracelet wieght :"+bracelet4.wieght);
		
		
		
	    System.out.println("End main in BraceletTrainee");

	}
}