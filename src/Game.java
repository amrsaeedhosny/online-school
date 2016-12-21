import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game 
{
	String name;
	String type;
	ArrayList <Question> questions = new ArrayList <Question> ();
	Map < String , Integer > scoreboard = new HashMap < String , Integer > ();
	int playerScore;
	String help;
	
	String getName ()
	{
		return name;
	}
	
	String getHelp ()
	{
		return help;
	}
	
	String getHint ( int questionNumber )
	{
		return questions.get(questionNumber).hint;
	}
	
	int getPlayerScore ()
	{
		return playerScore;
	}
	
	Map < String , Integer > getScoreboard ()
	{
		return scoreboard;
	}
	
	void updateScoreboard (String username)
	{
		scoreboard.put(username, playerScore);
	}
	
}