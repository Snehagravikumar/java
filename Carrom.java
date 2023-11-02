class Carrom
{
String panColor;
int noOfPans;
String carromShape;
double cost;
int noOfPlayers;

Carrom()
{

this("red",1,"Rectangle",3000,4);
	
}

Carrom(String panColor,int noOfPans)
{
	this.panColor=panColor;
	this.noOfPans=noOfPans;
System.out.println("Carrom with panColor and noOfPans :"+panColor+","+noOfPans);
}

Carrom(String panColor,int noOfPans,String carromShape)
{
	this(panColor,noOfPans);
	this.carromShape=carromShape;
System.out.println("Carrom with panColor,noOfPans and shape  :"+panColor+","+noOfPans+","+carromShape);
		
}

Carrom(String panColor,int noOfPans,String carromShape,double cost)
{
	this(panColor,noOfPans,carromShape);
	this.cost=cost;
System.out.println("Carrom with panColor,noOfPans,shape and cost :"+panColor+","+noOfPans+","+carromShape+","+cost);

}

Carrom(String panColor,int noOfPans,String carromShape,double cost,int noOfPlayers)
{
	this(panColor,noOfPans,carromShape,cost);
	this.noOfPlayers=noOfPlayers;
System.out.println("Carrom with panColor,noOfPans,shape and cost :"+panColor+","+noOfPans+","+carromShape+","+cost+","+noOfPlayers);

}
}