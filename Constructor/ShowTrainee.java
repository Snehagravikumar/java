class ShowTrainee
{

public static void main(String[] args)
{
	System.out.println("Start main in ShowTrainee ");
	
	
	Speaker speaker=new Speaker(150);
	Tv tv=new Tv(speaker);
	tv.displayTv();
	
	System.out.println("========================");

	MenuCard menucard=new MenuCard();
	menucard.setTotal(30);
	menucard.setCost(100); 
	 
	Hotel hotel=new Hotel();
	hotel.setMenuCard(menucard);
	hotel.displayHotel();
	
	System.out.println("========================");
     
	Job job=new Job();
	Company company=new Company(job);
	company.displayCompany();
	
	System.out.println("========================");

    String doctorName="Sneha";
	int doctorExp=6;
	boolean doctorFake=false;
	double doctorFee=500;

    Doctor doctor;
	doctor=new Doctor(doctorName,doctorExp,doctorFake,doctorFee);
     Clinic clinic=new Clinic(doctor);
	 clinic.displayClinic();


	System.out.println("End main in ShowTrainee");

}
}