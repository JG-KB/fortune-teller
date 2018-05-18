package fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, I am your Fortune Teller!");
		System.out.println(" What is your first name? ");
		String userFirstName = input.nextLine();
		System.out.println(" Hello! I am the Great " + userFirstName + "!" + " Shocking we have the same first name!! "
				+ " I can tell you your fortune if you will answer my questions. ");
		System.out.println(
				" Would you like your fortune to be told to you?" + " If not please write quit in the next line.");

		System.out.println("What is your last name? ");
		String userLastName = input.nextLine();
		System.out.println("What is your age? ");
		int userAge = input.nextInt();
		if ((userAge % 2 == 0)) {
			System.out.println("You will retire in 10 years");
		} else 
			System.out.println("You will retire in 15 years");
		

		System.out.println("What is your birth month number 1 -12? ");

		String birthMonth = input.next();
		 switch (birthMonth) {
		 case "1" :
		 case "2" :
		 case "3" :
		 case "4" :
			 System.out.println (" Your bank account will be  10,000,000 dollars.");
			 break;
		 case "5" :
		 case "6" :
		 case "7" :
		 case "8" :
			 System.out.println( " Your bank account will be 5,000,000 dollars.");
			 break;
		 case "9" :
		 case "10" :
		 case "11" :
		 case "12" :
			 System.out.println( " Your bank account will be 1,000,000 dollars.");
			 break;
			 default:
				 System.out.println( " I'm sorry, you will have 0.00 dollars");
			 
		 }

		System.out.println("What is your favorite color from the ROYGBIV colors? ");

		String favRoygbivColor = input.next();
		 switch( favRoygbivColor) {
		 case "red" : System.out.println( "You will have a Jeep");
		 break;
		 
		 case "orange" : System.out.println( "You will have a Elephant");
			 break;
		 case "yellow" : System.out.println( "You will have a Ford Mustang");
		 break;
			 
		 case "green" : System.out.println( "You will have a private jet");
		 break;
			 
		 case "blue" : System.out.println( "You will have a telsa teleporter");
		 break;
			 
		 case "indigo" : System.out.println( "You will have a Rick and Morty portal gun");
		 break;
			 
		 case "violet" : System.out.println( "You will have a jetpack");
		 break;
			 
		 }

		System.out.println("How many siblings do you have number format");

		int siblingsNum = input.nextInt();
		input.nextLine();
		String vactionHouse = "";
		switch ( siblingsNum) { 
		case 0: 
			vactionHouse= "Hamburg, Germany";
		break;
		case 1: 
			vactionHouse= "Helsinki, Finland";
		break;
		case 2:
			vactionHouse = " Toronto, Canada";
		break;
		
//		case 3:
//			vactionHouse="Vienna, Austria";
//		break;
//		case (<3): 
//			vactionHouse=" Marrakesh, Morocco";
//		break;
//		case  >0: 
//			vactionHouse=" The Ice Wall";
//		
//				
		}
		}
	}

