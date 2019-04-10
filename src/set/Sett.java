package set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import main.Main;

public class Sett {
	
	static Set<String> hash_Set = new TreeSet<String>(); 


	
	
	public Sett() {}
	
	
	public static void setOption(){
		
		System.out.println("Welcome to the SET options..");
		System.out.println("Please select an option...");
		System.out.println("select 1 to VIEW SET, 2 for Add to SET, 3 remove from SET. 4 for HOME");
		Scanner select = new Scanner(System.in);
		String option = select.nextLine();
		switch (option){
		case "1" :
			viewSET();
			break;
		case "2" :
			addSET();
			break;
		case "3":
			deleteSET();
		case "4":
			Main.selectOption();
		
		default: 
			System.out.println("Caught error in default in switch case...");
			System.out.println("You did not type 1 2 3 OR 4!!!");
			System.out.println("Please try again..");
			System.out.println("   ");
			setOption();
			select.close();
		
		
	}

}


	private static void deleteSET() {
		
		hash_Set.remove( ((TreeSet<String>) hash_Set).last() );
        System.out.println(hash_Set);

		setOption();
		
	}


	private static void addSET() {
		System.out.println("What would you like to add to the SET?");
		Scanner select = new Scanner(System.in);
		String option = select.nextLine();
		hash_Set.add(option);
        System.out.println(hash_Set);
		setOption();		
	}


	private static void viewSET() {
        System.out.println(hash_Set);
		setOption();		

	}
}
