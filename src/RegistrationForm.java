import java.util.Scanner;

public class RegistrationForm 
{
	Scanner in = new Scanner(System.in);
	String type;
	String firstName;
	String lastName;
	String username;
	String email;
	String birthday;
	String password;
	String gender;
	String professionalReference;
	String educationalStage;

	RegistrationForm ()
	{
		insertType();
		insertFirstName();
		insertLastName();
		insertUsername();
		insertEmail();
		insertBirthday();
		insertPassword();
		insertGender();
		// Depends on the type of the account
		insertProfessionalReference();
		insertEducationalStage();
	}
	
	void insertType()
	{
		int choice = 0;
		while ( choice != 1 && choice != 2 )
		{
			System.out.println("1- Register as a teacher.");
			System.out.println("2- Register as a student.");
			choice = in.nextInt();
			in.nextLine();
		}
		
		if ( choice == 1 )
		{
			type = "Teacher";
		}
		else
		{
			type = "Student";
		}
	}
	
	void insertFirstName ()
	{
		System.out.print("First Name: ");
		firstName = in.nextLine();
	}
	
	void insertLastName ()
	{
		System.out.print("Last Name: ");
		lastName = in.nextLine();
	}
	
	void insertUsername ()
	{
		System.out.print("Username: ");
		username = in.nextLine();
	}
	
	void insertEmail ()
	{
		System.out.print("Email: ");
		email = in.nextLine();
	}
	
	void insertBirthday ()
	{
		System.out.print("Birthday: ");
		birthday = in.nextLine();
	}
	
	void insertPassword ()
	{
		System.out.print("Password: ");
		password = in.next();
	}
	
	void insertGender ()
	{
		int choice = 0;
		while ( choice != 1 && choice != 2 )
		{
			System.out.println("1- Male.");
			System.out.println("2- Femal.");
			choice = in.nextInt();
			in.nextLine();
		}
		
		if ( choice == 1 )
		{
			gender = "Male";
		}
		else
		{
			gender = "Female";
		}
	}
	
	void insertProfessionalReference ()
	{
		if ( type.equals("Teacher") )
		{
			System.out.print("Professional Reference ( e.g. LinkedIn Account Link ): ");
			professionalReference = in.nextLine();
		}
	}
	
	void insertEducationalStage ()
	{
		if ( type.equals("Student") )
		{
			System.out.print("Educational Stage: ");
			educationalStage = in.nextLine();
		}
	}
	
	void usernameExistMessage ()
	{
		System.out.println("This username already exists!");
		System.out.println("Please enter your username,");
	}
	
	void emailExistMessage ()
	{
		System.out.println("This email already exists!");
		System.out.println("Please enter your email address,");
	}
	
	void createdSuccessfullyMessage ()
	{
		System.out.println("Your account has been created successfully!");
	}
}
