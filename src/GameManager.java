
public class GameManager 
{
	GameModel gameModel;
	
	GameManager (GameModel gameModel )
	{
		this.gameModel = gameModel;
	}
	
	void createGameForm ( AccountManager accountManager , String username , CategoryManager categoryManager , String categoryName )
	{
		GameForm gameForm = new GameForm();
		validateFormContent( gameForm );
		
		Game game = new Game ();
		game.name = gameForm.name;
		game.type = gameForm.type;
		game.questions = gameForm.questions;
		game.help = gameForm.help;
		
		gameModel.insertGame(game);
		accountManager.addGameToAccount(username, game);
		categoryManager.addGameToCategory(categoryName, game);
		
	}
	
	void validateFormContent ( GameForm gameForm )
	{
		while ( gameModel.checkExist(gameForm.name) )
		{
			System.out.println("Game name already exists!");
			gameForm.insertName();
		}
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
