import java.util.ArrayList;

public class Category 
{
	String name;
	ArrayList <Game> games = new ArrayList <Game> ();
	
	ArrayList <Game> getGames ()
	{
		return games;
	}
	
	String getName ()
	{
		return name;
	}
	
	String getCategoryName ()
	{
		return name;
	}
	
	void addGame ( Game game )
	{
		games.add(game);
	}
	
}
