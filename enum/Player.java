class Player
{
	
	String name;
	Game game;
	
	void playGame(Game game)
	{
		System.out.println("Use play from Game");
		game.play();
	}
	
	void pauseGame(Game game)
	{
		System.out.println("Use pause from Game");
		game.pause();
		
	}
	void endGame(Game game)
	{
		System.out.println("Use pause from Game");
		game.end();
	}
	void displayPlayer()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Game :"+this.game);
	
		if(this.game!=null)
		{
			System.out.println("");
			System.out.println(" Game ID :"+this.game.id);
			System.out.println(" Game Total Players :"+this.game.totalPlayers);
			System.out.println(" Game Origin :"+this.game.origin);
		}
	}

}