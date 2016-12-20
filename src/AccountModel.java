import java.util.ArrayList;

public class AccountModel 
{
	ArrayList <Teacher> teachers = new ArrayList <Teacher> ();
	ArrayList <Student> students = new ArrayList <Student> ();
	
	void insertTournament ( String username, Tournament tournament )
	{
		for ( int i = 0 ; i < teachers.size() ; i++ )
		{
			if ( teachers.get(i).getUsername().equals(username) )
			{
				teachers.get(i).addTournament(tournament);
			}
		}
	}
	
	void insertGame ( String username, Game game )
	{
		for ( int i = 0 ; i < teachers.size() ; i++ )
		{
			if ( teachers.get(i).getUsername().equals(username) )
			{
				teachers.get(i).addGame(game);
			}
		}
	}
	
	void insertScore ( String username, int score )
	{
		// If the player was a teacher
		
		for ( int i = 0 ; i < teachers.size() ; i++ )
		{
			if ( teachers.get(i).getUsername().equals(username) )
			{
				teachers.get(i).addScore(score);
			}
		}
		
		// If the player was a student
		
		for ( int i = 0 ; i < students.size(); i++ )
		{
			if ( students.get(i).getUsername().equals(username) )
			{
				students.get(i).addScore(score);
			}
			
		}
	}
	
	void createAccount ()
	{
		
	}

}
