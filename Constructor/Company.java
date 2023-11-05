class Company
{
	
	String name="Accenture";
	double gstNO=100;
	String location="Bangalore Kormangla";
	Job job;
	
	Company(Job job)
	{
		this.job=job;
	}
	
	void displayCompany()
	{
			System.out.println("Start Company");
            System.out.println("Company Name :"+this.name);
			System.out.println("Company gstNO :"+this.gstNO);
			System.out.println("Company Location :"+this.location);
            if(this.job!=null)
			{
				System.out.println("Job Role :"+this.job.role);
				System.out.println("Job Salary :"+this.job.salary);
				System.out.println("Job Type :"+this.job.type);
			}
	       System.out.println("End Company");

	}
	
}