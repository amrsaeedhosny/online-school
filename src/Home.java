import java.util.ArrayList;
import java.util.Scanner;

public class Home {
	

	public static void main(String[] args) 
	{	
		/*ArrayList<Category> categories = new ArrayList<Category>();
		SetCategoriesName(categories);*/
		int choose = 0;
		System.out.println("1- New user ? Sign up");
		System.out.println("2- Already have account ? login ");
		Scanner in = new Scanner(System.in);
		choose = in.nextInt();
		AccountModel accountM = new AccountModel();
		AccountManager account = new AccountManager(accountM);
		
		if(choose == 1){
			account.createRegistrationForm();
		}
		if(choose == 2){
	//		account;
		}
		
		
		
	}
	
	
	 // Our Buttons that calls a specific functions
	
	static void SetCategoriesName(ArrayList<Category>categories)
	 {
	  categories.get(0).setName("Math");
	  categories.get(1).setName("Science");
	  categories.get(2).setName("Programming");
	  categories.get(3).setName("Language");
	 }
	
	
	void showCategoryGames ()
	{
		
	}
	
	void showGame( String gameName )
	{
		
	}
	
	void createGame ()
	{
		
	}
	
	void createTournament ()
	{
		
	}
	
	void publishTournament()
	{
		
	}

}
