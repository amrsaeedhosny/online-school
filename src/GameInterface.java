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
		
		int choice = 0; 
		
		help();
		playGame();
		
		do
		{
			choice = in.nextInt();
			
			if ( choice == 1 )
			{
				System.out.println(game.getHelp());
			}
			
		} while ( choice != 2 );
		
		
		game.play();
		
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
		System.out.print("Show Hint");
	}
	
	void submitAnswers()
	{
		System.out.println("Submit");
	}
	
	

}
