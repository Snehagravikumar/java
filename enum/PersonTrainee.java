class PersonTrainee
{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Email[] email= new Email[4];
	
		email[0]=new Email("email.com",657,"RAVI","GOWDRU");
		
		email[1]=new Email("gmail.com",242,"KIRAN","KUMAR");
		
		email[2]=new Email("yahoo.com",622,"HITHAN","MARAD");
		
		email[3]=new Email("facebook.com",368,"SNEHA","G R");
		
		Person person = new Person("Sneha",email);
		person.displayInfo();
		
		System.out.println("Ending main");
	}
}