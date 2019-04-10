package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Main;

public class Listt {
	static List<String> list = new ArrayList<>();
	
	
	public Listt() {
		
		
		
	}
	
	public static void listOptions(){
		
			System.out.println("Welcome to the LIST options..");
			System.out.println("Please select an option...");
			System.out.println("select 1 to VIEW List, 2 for Add to LIST, 3 remove from LIST. 4 for HOME");
			Scanner select = new Scanner(System.in);
			String option = select.nextLine();
			switch (option){
			case "1" :
				viewList();
				break;
			case "2" :
				addList();
				break;
			case "3":
				deleteList();
			case "4":
				Main.selectOption();
			
			default: 
				System.out.println("Caught error in default in switch case...");
				System.out.println("You did not type 1 2 3 OR 4!!!");
				System.out.println("Please try again..");
				System.out.println("   ");
				listOptions();
				select.close();

		
		
	}

}

		private static void deleteList() {
			System.out.println("Case 3");
			list.remove(list.size()-1);
			System.out.println(list);

			listOptions();

			
		}

		private static void addList() {
			System.out.println("Case 2.");
			System.out.println("What would you like to add to the list?");
			Scanner select = new Scanner(System.in);
			String option = select.nextLine();
			list.add(option);
			System.out.println(list);
			listOptions();


			
		}

		private static void viewList() {
			
			System.out.println(list);
			listOptions();	
			
		}
		
}
