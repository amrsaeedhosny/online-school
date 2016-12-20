public class GameManager 
{
	GameModel gameModel;
	
	GameManager (GameModel gameModel )
	{
		this.gameModel = gameModel;
	}
	
	void validateFormContent ( GameForm gameForm )
	{
		
	}
	
	void runGameInterface ( String gameName, AccountManager accountManager, String username )
	{
		Game game = gameModel.retrieveGame(gameName);
		GameInterface gameInterface = new GameInterface(game);
		
		// Will be running until the user exits or finishes the game
		
		gameInterface.run();
		
		int playerScore = game.getPlayerScore();
		System.out.println(playerScore);
		
		accountManager.addScore(username,playerScore);
		game.updateScoreboard(username);
		game.getScoreboard();

	}
	
	
}
