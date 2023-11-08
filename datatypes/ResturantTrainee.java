class ResturantTrainee
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ResturantTrainee ");
		
		
		String[] arrayItems=new String[5];
		
		arrayItems[0]="Gulab Jamun";
		arrayItems[1]="Carrot Halva";
		arrayItems[2]="Paysa";
		arrayItems[3]="Holige";
		arrayItems[4]="veg Beriyani";
		
		Resturant resturant=new Resturant();
		resturant.setSpecialItems(arrayItems);
		resturant.displayResturant();
		
		
		
		System.out.println("End main in ResturantTrainee ");

	}
}