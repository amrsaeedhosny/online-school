import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
	
	void play ()
	{
		Scanner in = new Scanner(System.in);
		
		for ( int i = 0 ; i < questions.size() ; i++ )
		{
			System.out.println(questions.get(i).header);
			for ( int j = 0 ; j < questions.get(i).choices.size() ; j++ )
			{
				System.out.print(j+1 + " - ");
				System.out.println(questions.get(i).choices.get(j));
			}
			
			if ( !questions.get(i).hint.equals(null) )
			{
				String choice;
				System.out.println("Do you want to show hint? (Y/N): ");
				choice = in.next();
				if ( choice.equals("Y") )
				{
					System.out.println(questions.get(i).hint);
				}
			}
			
			int choice = in.nextInt();
			
			if ( questions.get(i).choices.get(choice-1).equals(questions.get(i).solution) )
			{
				playerScore += 10;
			}
		}
		
		in.close();
	}
	
	String getHint ( int questionNumber )
	{
		return questions.get(questionNumber).hint;
	}
	
	int getPlayerScore ()
	{
		return playerScore;
	}
	
	void getScoreboard ()
	{
		for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) 
		{
		    System.out.println(entry.getKey() + entry.getValue());
		}
	}
	
	void updateScoreboard (String username)
	{
		scoreboard.put(username, playerScore);
	}
	
}
