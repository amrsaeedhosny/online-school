
public class AccountManager 
{
	AccountModel accountModel;
	
	AccountManager ( AccountModel accountModel )
	{
		this.accountModel = accountModel;
	}
	
	void addTournamentToAccount ( String username, Tournament tournament )
	{
		accountModel.insertTournament(username, tournament);
	}
	
	void addGameToAccount ( String username, Game game )
	{
		accountModel.insertGame(username, game);
	}
	
	void addScore ( String username, int score )
	{
		accountModel.insertScore(username, score);
		
	}
	
	
}
