class Showroom
{
String name;
double width=500;
int height=550;
String product="Car";
int noOfWorkers;
int noOfProducts;
String managerName="Sneha";
int noOfBranch;

Showroom()
	{
		System.out.println("Showroom created ");
	}
Showroom(String name)
	{
		this.name=name;
		System.out.println("Showroom with name :"+name);
	}
Showroom(double width,int height)
	{
		this.width=width;
		this.height=height;
		System.out.println("Showroom with width and height :"+width+","+height );
	}
Showroom(int height,String name)
	{
		this.height=height;
		this.noOfWorkers=noOfWorkers;
		System.out.println("Showroom with height and Workers :"+height+","+noOfWorkers);
	}
Showroom(String product,String managerName)
	{
		this.product=product;
		this.managerName=managerName;
		System.out.println("Showroom with product and managerName :"+product+","+managerName);
	}
Showroom(int noOfWorkers,int noOfProducts)
	{
		this.noOfWorkers=noOfWorkers;
		this.noOfProducts=noOfProducts;
		System.out.println("showroom with noOfWorkers and product :"+noOfWorkers+","+noOfProducts);
	}
Showroom(int noOfProducts,double width)
	{
		this.noOfProducts=noOfProducts;
		this .width=width;
		System.out.println("Showroom with product and noOfProducts :"+noOfProducts+","+width);
	}
Showroom( String name,int noOfBranch)
	{
		this.noOfBranch=noOfBranch;
		this.name=name;
		System.out.println("Showroom with branch and name:"+noOfBranch+"," +name);
	}
}