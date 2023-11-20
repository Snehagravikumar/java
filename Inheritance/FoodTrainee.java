class FoodTrainee
{
	public static void main(String[] args)
	{
		System.out.println("Start main in FoodTrainee");
		
		Food food=new Food();
		Food food1= new Sweet();
		Food food2= new Ladoo();
		Food food3=new MothichuruLadoo();
		System.out.println("++++++++++++++");
        Sweet sweet=new Sweet();
		Sweet sweet1= new Ladoo();
		Sweet sweet2=new MothichuruLadoo();		
		System.out.println("++++++++++++++");
		Ladoo ladoo=new Ladoo();
		Ladoo ladoo1=new MothichuruLadoo();
		System.out.println("++++++++++++++");
		MothichuruLadoo mothichuru=new MothichuruLadoo();
		
		System.out.println("*****************************************************");
		
		Biscuit biscuit=new Biscuit();
		Biscuit biscuit1=new Tiger();
		Biscuit biscuit2=new SpecialTiger();
		Biscuit biscuit3=new GlucoTiger();
		Biscuit biscuit4=new Parle();
		Biscuit biscuit5=new GlucoParle();
		System.out.println("++++++++++++++");
		Tiger tiger=new Tiger();
		Tiger tiger1=new SpecialTiger();
		Tiger tiger2=new GlucoTiger();
		System.out.println("++++++++++++++");
        SpecialTiger special=new SpecialTiger();
		System.out.println("++++++++++++++");
        GlucoTiger glucotiger=new GlucoTiger();
		System.out.println("++++++++++++++");
        Parle parle=new Parle();
		Parle parle1=new GlucoParle();
		System.out.println("++++++++++++++");
		GlucoParle glucoparle=new GlucoParle();
		
		System.out.println("*****************************************************");
        Liquid liquid=new Liquid();
        Liquid liquid1=new Water();
        Liquid liquid2=new Juice();
        Liquid liquid3=new MangoJuice();
		System.out.println("++++++++++++++");
        Water water=new Water();
		System.out.println("++++++++++++++");
        Juice juice=new Juice();
		Juice juice1=new MangoJuice();
		System.out.println("++++++++++++++");
		MangoJuice mango=new MangoJuice();
		
		System.out.println("End main in FoodTrainee");
	}
	
}