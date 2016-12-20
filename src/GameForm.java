import java.util.ArrayList;
import java.util.Scanner;

public class GameForm 
{
	Scanner in = new Scanner(System.in);
	String name;
	String type;
	ArrayList <Question> questions = new ArrayList <Question> ();
	String help;
	
	GameForm ()
	{
		insertName();
		insertType();
		insertQuestions();
		insertHelp();
	}
	
	void insertName ()
	{		
		System.out.print("Enter Game Name: ");
		name = in.nextLine();
	}
	
	void insertType ()
	{
		System.out.print("Enter Game Type (MCQ/TF): ");
		type = in.nextLine();
	}
	
	void insertQuestions ()
	{
		int choice = 0;
		
		System.out.println("1- Add question");
		System.out.println("2- Finish");
		choice = in.nextInt();
		
		while ( choice != 2 )
		{
			Question question = new Question(type);
			System.out.print("Enter question header: ");
			question.setHeader(in.nextLine());
			
			if ( type.equals("MCQ") )
			{
				ArrayList <String> choices = new ArrayList <String>();
				for ( int i = 0 ; i < 4 ; i++ )
				{
					System.out.print( "Enter cohice number " + (i+1) + " : " );
					choices.add(in.nextLine());
				}
				question.setChoices(choices);
			}
			
			System.out.print("Enter correct answer: ");
			question.setSolution(in.nextLine());
			
			String hintChoice;
			System.out.print("Do you want to add some hint ? (Y/N) : ");
			hintChoice = in.next();
			if ( hintChoice.equals("Y") )
			{
				System.out.print("Enter hint statement: ");
				question.setHint(in.nextLine());
			}
			
			questions.add(question);
				
			System.out.println("1- Add question");
			System.out.println("2- Finish");
			choice = in.nextInt();
		}
		
	}
	
	void insertHelp ()
	{
		System.out.print("Eneter help statement: ");
		help = in.nextLine();
	}

}
