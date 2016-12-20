import java.util.ArrayList;
import java.util.Scanner;

public class TournamentForm
{
	Scanner in = new Scanner(System.in);
	String name;
	String type;
	ArrayList <Question> questions = new ArrayList <Question> ();
	String date;
	String startTime;
	String finishTime;
	
	TournamentForm ()
	{
		insertName();
		insertType();
		insertQuestions();
		insertDate();
		insertStartTime();
		insertFinishTime();
	}
	
	void insertName ()
	{		
		System.out.print("Enter Tournament Name: ");
		name = in.nextLine();
	}
	
	void insertType ()
	{
		System.out.print("Enter Tournament Type (MCQ/TF): ");
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
			
			questions.add(question);
				
			System.out.println("1- Add question");
			System.out.println("2- Finish");
			choice = in.nextInt();
		}
		
	}
	
	void insertDate ()
	{
		System.out.print("Enter date: ");
		date = in.nextLine();
	}

	void insertStartTime ()
	{
		System.out.print("Enter start time: ");
		startTime = in.nextLine();
	}
	
	void insertFinishTime()
	{
		System.out.print("Enter finish time: ");
		finishTime = in.nextLine();
	}

}
