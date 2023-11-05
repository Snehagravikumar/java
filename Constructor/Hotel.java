class Hotel
{
 String name;
 String ownerName="sneha";
 MenuCard menucard;
 
 void setMenuCard(MenuCard menucard)
 {
	 this.menucard=menucard;
 }
  
 void displayHotel()
 {
	 	System.out.println("Start DisplayHotel");
				System.out.println("Hotel Name :"+this.name);
			    System.out.println("Hotel ownerName :"+this.ownerName);
		        System.out.println("MenuCard :"+this.menucard);
                 if(this.menucard!=null)
				 {
					 		System.out.println("MenuCard Total Items :"+this.menucard.totalItems);
		                    System.out.println("MenuCard Cost :"+this.menucard.cost);

				 }
			
			
		System.out.println("End DisplayHotel");

 } 

}