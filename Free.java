class Free
{
	String what;
	String why;
	boolean freeForAll;
	
	Free()
	{
		
	}
	Free(String what,String why,boolean freeForAll)
	{
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
		System.out.println("Free What :"+this.what);
		System.out.println("Free Why :"+this.why);
		System.out.println(" freeForAll :"+this.freeForAll);

	}
	
	void displayFree()
	{
		
		System.out.println("Free What :"+this.what);
		System.out.println("Free Why :"+this.why);
		System.out.println(" freeForAll :"+this.freeForAll);
	}
}