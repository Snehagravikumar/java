class Game
{
	int id;
	String name;
	TotalPlayers totalPlayers=TotalPlayers.HITHAN;
	String origin;
	
	void play()
	{
		System.out.println("Game");
		System.out.println(" ID :"+this.id);
		System.out.println(" name:"+this.name);
		System.out.println("Origin :"+this.origin);
	}
	void pause()
	{
		System.out.println("Pause");	
	}
	void end()
	{
		System.out.println("end");	
	}
	void displayGame()
	{
		System.out.println("DisplayGame");
		System.out.println(" Game ID :"+this.id);
		System.out.println("Game name:"+this.name);
		System.out.println(" Game Total Players :"+this.totalPlayers);
		System.out.println(" Game Origin :"+this.origin);
	}
}
 