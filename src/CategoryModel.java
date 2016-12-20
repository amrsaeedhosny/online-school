import java.util.ArrayList;

public class CategoryModel 
{
	ArrayList <Category> categories = new ArrayList <Category>();
	
	void insertGame ( String name , Game game )
	{
		for ( int i = 0 ; i < categories.size() ; i++ )
		{
			if ( categories.get(i).getName().equals(name) )
			{
				categories.get(i).getGames().add(game);
			}
		}
	}
	
	ArrayList <Game> retrieveCategoryGames ( String name )
	{
		ArrayList <Game> categoryGames = null;
		for ( int i = 0 ; i < categories.size() ; i++ )
		{
			if ( categories.get(i).getName().equals(name) )
			{
				categoryGames = categories.get(i).getGames();
			}
		}
		return categoryGames;
	}
	

}
