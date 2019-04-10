package map;

import java.util.HashMap;
import java.util.Scanner;

import main.Main;

public class Mapp {
	
	static HashMap<String, String> hash_map = new HashMap<String, String>(); 

	
	
	public Mapp() {}

	
	public static void mapOptions() {
		System.out.println("Welcome to the MAP options..");
		System.out.println("Please select an option...");
		System.out.println("select 1 to VIEW MAP, 2 for Add to MAP, 3 remove from MAP. 4 for HOME");
		Scanner select = new Scanner(System.in);
		String option = select.nextLine();
		switch (option){
		case "1" :
			viewMAP();
			break;
		case "2" :
			addMAP();
			break;
		case "3":
			deleteMAP();
		case "4":
			Main.selectOption();
		
		default: 
			System.out.println("Caught error in default in switch case...");
			System.out.println("You did not type 1 2 3 OR 4!!!");
			System.out.println("Please try again..");
			System.out.println("   ");
			mapOptions();
			select.close();		
	}

}




	private static void deleteMAP() {
		System.out.println("Please type in key you which to delete its value...");
		Scanner d = new Scanner(System.in);
		String delete = d.nextLine();
	      hash_map.remove(delete);
        System.out.println("Initial Mappings are: " + hash_map);

		mapOptions();
		
	}




	private static void addMAP() {
		System.out.println("Welcome to the MAP options..");
		System.out.println("Please select a key value...");
		Scanner k = new Scanner(System.in);
		String key = k.nextLine();
		System.out.println("Please select a value for the key...");
		Scanner v = new Scanner(System.in);
		String value = v.nextLine();
        hash_map.put(key, value); 
        
        
        System.out.println("Initial Mappings are: " + hash_map);

		mapOptions();

		
	}




	private static void viewMAP() {
        System.out.println("Initial Mappings are: " + hash_map);
        
		mapOptions();

		
	}
}

