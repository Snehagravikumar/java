class Clinic 
{
	String speciliazation="MBBS";
	int totalBeds=10;
	int totalPatients;
	Doctor doctor;
	
	Clinic(Doctor doctor)
	{
		this.doctor=doctor;
	}
	
	void displayClinic()
	{
		System.out.println("Start Clinic");
		System.out.println("Clinic Speciliazation :"+this.speciliazation);
		System.out.println("Clinic Total Beds :"+this.totalBeds);
		System.out.println("Clinic Total Patients :"+this.totalPatients);
		System.out.println("Clinic Doctor:"+this.doctor);

		if(this.doctor!=null)
		{
			System.out.println("Doctor Name :"+this.doctor.name);
			System.out.println("Doctor experience :"+this.doctor.experience);
			System.out.println("Doctor Fake :"+this.doctor.fake);
			System.out.println("Doctor Fees :"+this.doctor.fees);

		}
	}
}