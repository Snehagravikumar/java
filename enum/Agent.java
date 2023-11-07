class Agent
{
    int id=104;
    String name="Sneha";
    String company="ABC";
    Tent tent;
	
	void  openTent(Tent tent)
	{
		tent.open();
		this.tent=tent;
		System.out.println("Agent Tent is open");
		System.out.println("Display Tent in openTent :"+this.tent);
		if(this.tent!=null)
		{
		System.out.println("Display Tent slNo :"+this.tent.slNo);		
		System.out.println("Display Tent color :"+this.tent.color);
        System.out.println("Display Tent width :"+this.tent.width);
	    System.out.println("Display Tent height :"+this.tent.height);
		}
	}
	void  closeTent(Tent tent)
	{
		tent.close();
		this.tent=tent;
		System.out.println("Display Tent in closeTent :"+tent);

		System.out.println("Agent Tent is close");
	}
	
	void  displayAgent()
	{
		System.out.println("Display Agent");
		System.out.println("Display Agent id :"+this.id);
		System.out.println("Display Agent name :"+this.name);
		System.out.println("Display Agent Comapany :"+this.company);
		
	}
}
