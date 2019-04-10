package main;

import java.util.Scanner;

import list.Listt;
import map.Mapp;
import set.Sett;

public class Main {

	public static void main(String[] args) {
		selectOption();

		
	}
	
	
	
	public static void selectOption() {
		System.out.println("Welcome to the Collections Example");
		System.out.println("Please select an option...");
		System.out.println("select 1 for LIST, 2 for SET, 3 for MAP.");
		Scanner select = new Scanner(System.in);
		String option = select.nextLine();
		switch (option){
		case "1" :
			Listt.listOptions();
			
			break;
		case "2" :
			//set
			Sett.setOption();
			break;
		case "3" :
			//MAP
			Mapp.mapOptions();
			break;

		default: 
			System.out.println("Caught error in default in switch case...");
			System.out.println("You did not type 1 2 or 3!!!");
			System.out.println("Please try again..");
			System.out.println("   ");
			selectOption();
			select.close();

		}

}}
