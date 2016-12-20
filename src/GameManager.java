
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
	
	void runGameInterface ( String gameName )
	{
		Game game = gameModel.retrieveGame(gameName);
		GameInterface gameInterface = new GameInterface(game);
		
		// Will be running until the user exits or finishes the game
		
		gameInterface.run();
		
		System.out.println(game.getPlayerScore());
		
		// Here We Should update the player score in the account
		
	}
}
