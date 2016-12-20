import java.util.ArrayList;

public class Home {
	

	public static void main(String[] args) 
	{	
		// Create ArrayLists of accounts here
		
		
		// Fill all of the ArrayLists in the appropriate model/database
		
		AccountModel accountModel = new AccountModel();
		CategoryModel categoryModel = new CategoryModel();
		GameModel gameModel = new GameModel();
		TournamentModel tournamentModel = new TournamentModel();
				
		// Create managers to deal with our models/databases
		
		AccountManager accountManager = new AccountManager(accountModel);
		CategoryManager categoryManager = new CategoryManager(categoryModel);
		GameManager gameManager = new GameManager(gameModel);
		TournamentManager tournamentManager = new TournamentManager(tournamentModel);
		
		// After that you should use the controllers only
		
		
	
		

	}
	
	
	// Our Buttons that calls a specific functions
	
	void showCategoryGames ()
	{
		
	}
	
	void showGame( String gameName )
	{
		
	}
	
	void createGame ()
	{
		
	}
	
	void createTournament ()
	{
		
	}
	
	void publishTournament()
	{
		
	}

}
