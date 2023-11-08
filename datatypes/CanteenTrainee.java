class CanteenTrainee
{
	public static void main(String[] args)
	{
       System.out.println("Start main in CanteenTrainee");	
	
		String ref="Pure Veg";
		Canteen canteen=new Canteen(ref);
		
		String[] arrayUtensils=new String[40];
		arrayUtensils[0]="Apron";
		arrayUtensils[1]="Blender";
		arrayUtensils[2]="Bottle";
		arrayUtensils[3]="Bottel Opener";
		arrayUtensils[4]="Bowl";
		arrayUtensils[5]="Spoon";
		arrayUtensils[6]="Plate";
		arrayUtensils[7]="Vessel";
		arrayUtensils[8]="Butter Knife";
		arrayUtensils[9]="Jar";
		arrayUtensils[10]="Fork";
		arrayUtensils[11]="Knife";
		arrayUtensils[12]="Jug";
		arrayUtensils[13]="Kettle";
		arrayUtensils[14]="Oven Gloves";
		arrayUtensils[15]="Kiten Towel";
		arrayUtensils[16]="Grater";
		arrayUtensils[17]="Juicer";
		arrayUtensils[18]="Dish Rac";
		arrayUtensils[19]="Egg Slicer";
		arrayUtensils[20]="Deep Fryer";
		arrayUtensils[21]="Cutting Board";
		arrayUtensils[22]="Cup";
		arrayUtensils[23]="Gas Stove";
		arrayUtensils[24]="Oven";
		arrayUtensils[25]="Pan";
		arrayUtensils[26]="MatchBox";
		arrayUtensils[27]="Whisk";
		arrayUtensils[28]="Rolling Pin";
		arrayUtensils[29]="Wok";
		arrayUtensils[30]="Sieve";
		arrayUtensils[31]="Ladle";
		arrayUtensils[32]="Lemon Squeezer";
		arrayUtensils[33]="Pressure Cooker";
		arrayUtensils[34]="Stewpot Cooker";
		arrayUtensils[35]="Refrigerator";
		arrayUtensils[36]="Spatual";
		arrayUtensils[37]="Peeler";
		arrayUtensils[38]="Grinder";
		arrayUtensils[39]="Wooden Spoons";
		
		
		canteen.setUtensil(arrayUtensils);
        canteen.displayCanteen();

		System.out.println("End main in CanteenTrainee");	

	}
}