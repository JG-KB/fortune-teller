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
		String retirement;
		if ((userAge % 2 == 0)) {
			retirement = "7 years";
		} else
			retirement = "11 years";

		System.out.println("What is your birth month number 1-12? ");

		int birthMonth = input.nextInt();
		String bankAccount = " ";
		if (birthMonth > 0 && birthMonth <= 4) {
			bankAccount = "10,000,000 dollars";
		}
		else if (birthMonth>4 && birthMonth<=9) {
			 bankAccount= "5,000,000 dollars";
		}
		else if (birthMonth>9 && birthMonth<=12) {
			bankAccount= "1,000,000 dollars";
		
		}else  
			bankAccount= "0.00 dollars";


		System.out.println("What is your favorite color from the ROYGBIV colors? If you don't know what the ROYGBIV colors are type in help and I will tell you. ");

		String favRoygbivColor = input.next().toLowerCase();
		String favColor = favRoygbivColor.toLowerCase();
		if (favRoygbivColor.equals("help")) {
			System.out.println(" The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet");
		}
		String car = " ";

		switch (favColor) {
		case "red":
			car = "a Jeep";
			break;

		case "orange":
			car = "a Elephant";
			break;
		case "yellow":
			car = "a Ford Mustang";
			break;

		case "green":
			car = "a private jet";
			break;

		case "blue":
			car = "a Telsa HyperLoop";
			break;

		case "indigo":
			car = "a Rick and Morty portal gun";
			break;

		case "violet":
			car = "a jetpack";
			break;

		case "help":
			car = "a ROYGBIV GITBACK TRYAGAINATRON";
		default:
		}

		System.out.println("How many siblings do you have in number format?");

		int siblingsNum = input.nextInt();
		String vacationLand = " ";

		if (siblingsNum == 0) {
			vacationLand = "Mar's City, Mars";
		} else if (siblingsNum == 1) {
			vacationLand = "Hamburg, Germany";
		} else if (siblingsNum == 2) {
			vacationLand = "Helsinki, Finland";
		} else if (siblingsNum == 3) {
			vacationLand = "Toronto, Canada";
		} else if (siblingsNum > 3) {
			vacationLand = "Marrakesh, Morocco";

		} else {
			vacationLand = "on The Ice Wall of Westeros.";
		}

		System.out.println("*[" + userFirstName + "]*" + " " + "*[" + userLastName + "]*" + " will retire in " + "*["
				+ retirement + "]*" + "" + " with " + "*[" + bankAccount + "]*" + " in the bank, "
				+ "a vacation home in " + "*[" + vacationLand + "]*," + "and travel by " + "*[" + car + "]*.");

	}

}


//wanted to show you this also
//String birthMonth = input.next();
//String bankAccount = " ";
//switch (birthMonth) {
//case "1":
//	bankAccount = " Your bank account will be  10,000,000 dollars.";
//case "2":
//	bankAccount = " Your bank account will be  10,000,000 dollars.";
//case "3":
//	bankAccount = " Your bank account will be  10,000,000 dollars.";
//case "4":
//	bankAccount = " Your bank account will be  10,000,000 dollars.";
//	bankAccount = "10,000,000 dollars";
//	break;
//case "5":
//	bankAccount = " Your bank account will be 5,000,000 dollars.";
//case "6":
//	bankAccount = " Your bank account will be 5,000,000 dollars.";
//case "7":
//	bankAccount = " Your bank account will be 5,000,000 dollars.";
//case "8":
//	bankAccount = " Your bank account will be 5,000,000 dollars.";
//	bankAccount = "5,000,000 dollars";
//	break;
//case "9":
//	bankAccount = " Your bank account will be 1,000,000 dollars.";
//case "10":
//	bankAccount = " Your bank account will be 1,000,000 dollars.";
//case "11":
//	bankAccount = " Your bank account will be 1,000,000 dollars.";
//case "12":
//	bankAccount = " Your bank account will be 1,000,000 dollars.";
//	bankAccount = "1,000,000 dollars";
//	break;
//default:
//	bankAccount = "0.00 dollars";
