import java.util.Map;
import java.util.Scanner;

public class GameInterface 
{
	Game game;
	
	GameInterface (Game game)
	{
		this.game = game;
	}
	
	void run ()
	{
		Scanner in = new Scanner(System.in);
		
		int helpChoice = 0; 
		
		help();
		playGame();
		
		do
		{
			helpChoice = in.nextInt();
			in.nextLine();
			
			if ( helpChoice == 1 )
			{
				System.out.println(game.getHelp());
			}
			
		} while ( helpChoice != 2 );
		
		
		
		for ( int i = 0 ; i < game.questions.size() ; i++ )
		{
			int questionPoints = 10;
			System.out.println(game.questions.get(i).header);
			for ( int j = 0 ; j < game.questions.get(i).choices.size() ; j++ )
			{
				System.out.print(j+1 + "- ");
				System.out.println(game.questions.get(i).choices.get(j));
			}
			
			if ( !( game.questions.get(i).hint.equals("NO HINT") ) )
			{
				String hintChoice;
				showHint();
				hintChoice = in.nextLine();
				System.out.println(hintChoice);
				if ( hintChoice.equals("Y") )
				{
					System.out.println(game.questions.get(i).hint);
					questionPoints -= (questionPoints/5);
				}
			}
			System.out.println("Enter your solution");
			String solutionChoice;
			solutionChoice = in.nextLine();
			
			if ( solutionChoice.equals(game.questions.get(i).solution) )
			{
				game.playerScore += questionPoints;
			}
		}
		
		
		in.close();
	}
	
	void help ()
	{
		System.out.println("1- Help");
	}
	
	void playGame()
	{
		System.out.println("2- Play Game");
	}
	
	void showHint()
	{
		System.out.print("Do you want to show hint? (Y/N): ");
	}
	
	void showScore ()
	{
		System.out.println("Your Score is: " + game.getPlayerScore() );
	}
	
	void showScoreBoard()
	{
		System.out.println("Score Board");
		for (Map.Entry<String, Integer> entry : game.scoreboard.entrySet()) 
		{
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
