public class GameManager 
{
	GameModel gameModel;
	int latestEarnedScore;
	
	GameManager (GameModel gameModel )
	{
		this.gameModel = gameModel;
	}
	
	void validateFormContent ( GameForm gameForm )
	{
		
	}
	
	void runGameInterface ( String gameName )
	{
		Game game = gameModel.retrieveGame(gameName);
		GameInterface gameInterface = new GameInterface(game);
		
		// Will be running until the user exits or finishes the game
		
		gameInterface.run();
		
		latestEarnedScore = game.getPlayerScore();
		System.out.println(latestEarnedScore);		
	}
	
	void addLatestEarnedScoreToAccount ( AccountManager accountManager , String username )
	{
		accountManager.addScore(username, latestEarnedScore);
	}
}
