class MakeupKitTrainee
{

public static void main(String[] args)
{
	System.out.println("Start main in MakeupKitTrainee");
	
	
	MakeupKit makeupkit=new MakeupKit();
	System.out.println("MakeupKit Brand :"+makeupkit.brand);
	System.out.println("MakeupKit Ratings :"+makeupkit.ratings);
	System.out.println("MakeupKit Cost :"+makeupkit.cost);
	System.out.println("MakeupKit items :"+makeupkit.items);

	System.out.println("==============================");
	
	MakeupKit makeupkit1=new MakeupKit("Nykaa");
	System.out.println("MakeupKit Brand :"+makeupkit1.brand);
	System.out.println("MakeupKit Ratings :"+makeupkit1.ratings);
	System.out.println("MakeupKit Cost :"+makeupkit1.cost);
	System.out.println("MakeupKit items :"+makeupkit1.items);

	System.out.println("==============================");

    MakeupKit makeupkit2=new MakeupKit("Nykka",5);
	System.out.println("MakeupKit Brand :"+makeupkit2.brand);
	System.out.println("MakeupKit Ratings :"+makeupkit2.ratings);
	System.out.println("MakeupKit Cost :"+makeupkit2.cost);
	System.out.println("MakeupKit items :"+makeupkit2.items);

	System.out.println("==============================");

    MakeupKit makeupkit3=new MakeupKit("Lakme",5,2000);
	System.out.println("MakeupKit Brand :"+makeupkit3.brand);
	System.out.println("MakeupKit Ratings :"+makeupkit3.ratings);
	System.out.println("MakeupKit Cost :"+makeupkit3.cost);
	System.out.println("MakeupKit items :"+makeupkit3.items);

	System.out.println("==============================");

    MakeupKit makeupkit4=new MakeupKit("Nykaa",4.5,1800,"Lipstick");
	System.out.println("MakeupKit Brand :"+makeupkit4.brand);
	System.out.println("MakeupKit Ratings :"+makeupkit4.ratings);
	System.out.println("MakeupKit Cost :"+makeupkit4.cost);
	System.out.println("MakeupKit items :"+makeupkit4.items);

	
	System.out.println("Start main in MakeupKitTrainee");

	
}

}