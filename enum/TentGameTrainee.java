class TentGameTrainee
{
	
	public static void main(String[] args)
	{
		System.out.println("Start main in TentGameTrainee");
		
		
		Tent tent=new Tent(40,TentColor.RED,20,10);
		tent.open();
		tent.displayTent();
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		tent.close();
		agent.displayAgent();
		
		System.out.println("\n\n");
		
		Game game=new Game();
		game.play();
		game.pause();
		game.end();
		game.displayGame();
		Player player=new Player();
		player.playGame(game);
		player.pauseGame(game);
		player.endGame(game);
		player.displayPlayer();
		
		System.out.println("End main in TentGameTrainee");
		
	}
	
}