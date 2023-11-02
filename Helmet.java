class Helmet
{
   String brand;
   String type;
   double cost;
   String color;
   int size;
   
   Helmet()
   {
	   this("Vega","full",680,"blue",10);
   }
   
   Helmet(String brand,String type,double cost)
   {
	   this.brand=brand;
	   this.type=type;
	   this.cost=cost;
	   System.out.println("Helmet with brand,type and cost :"+brand+","+type+","+cost);
   }

   Helmet(String brand,String type,double cost,String color)
   {
	   this(brand,type,cost);
	   this.color=color;
	   System.out.println("Helmet with brand,type,cost and color :"+brand+","+type+","+cost);

   }

   Helmet(String brand,String type,double cost,String color,int size)
   {
	   this(brand,type,cost,color);
	   this.size=size;
	   System.out.println("Helmet with brand,type,cost,color and size :"+brand+","+type+","+cost);

   }

}