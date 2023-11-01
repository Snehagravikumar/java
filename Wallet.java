class Wallet
{
   String brand;
   double cost;
   String color;
   int noOfPocket;
   
   Wallet()
   {
	   super();
   }
   Wallet(String brand)
   {
	   super();
	   this.brand=brand;
	   System.out.println("Wallet with brand :"+brand);
   }
   Wallet(String brand,double cost)
   {
	   this.brand=brand;
	   this.cost=cost;  
	   	  System.out.println("Wallet with brand and cost :"+brand+","+cost);

   }
   Wallet(String brand,double cost,String color)
   {
	   this.brand=brand;
	   this.cost=cost;
	   this.color=color;
	  	   System.out.println("Wallet with brand,cost and color :"+brand+","+cost+","+color);
 
   }
   Wallet(String brand,double cost,String color,int noOfPocket)
   {
	   this.brand=brand;
	   this.cost=cost;
	   this.color=color;
	   this.noOfPocket=noOfPocket;
	   	  System.out.println("Wallet with brand,cost,color and noOfPocket :"+brand+","+cost+","+color+","+noOfPocket);

	   
   }

}