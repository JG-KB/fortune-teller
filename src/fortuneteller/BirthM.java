package fortuneteller;

import java.util.Scanner;

public class BirthM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your birth month 1-12?");

		int birthMonth = input.nextInt();
		String bankAccount = " ";
		if (birthMonth > 0 && birthMonth <= 4) {
			bankAccount = "10,000,000 dollars";
		}
		else if (birthMonth>4 && birthMonth<=9) {
			 bankAccount= "5,000,000 dollars";
		}
		else if (birthMonth>9 && birthMonth<=12) {
		
		}else  
			bankAccount= "0.00 dollars";

			// }else if {(birthMonth>4 && birthMonth<9)
			// System.out.println("5,000,000 dollars");
			// } else if {(birthMonth>9 && birthMonth<12)
			// System.out.println("1,000,000 dollars");
			// }else (birthMonth<=0)
			// System.out.println( "0.00 dollars");

			// int siblingsNum = input.nextInt();
			// String vacationLand = " ";
			//
			// if (siblingsNum == 0) {
			// vacationLand = "Mar's City, Mars";
			// }
			// else if (siblingsNum == 1) {
			// vacationLand= "Hamburg, Germany";
			// }
			// else if (siblingsNum == 2) {
			// vacationLand= "Helsinki, Finland";
			// }
			// else if (siblingsNum == 3) {
			// vacationLand = "Toronto, Canada";}
			// else if (siblingsNum > 3) {
			// vacationLand = "Marrakesh, Morocco";
			//
			// } else {
			// vacationLand = "on The Ice Wall of Westeros."; }
			//
			//

			//
			// if(birthMonth > 0 && birthMonth < 4) {
			// bankAccount= "10,000,000 dollars";
			//
			// }else if (birthMonth>4 && birthMonth<9)
			// bankAccount= "5,000,000 dollars";

			// } else if{ (birthMonth>9 && birthMonth<12)
			// bankAccount= "1,000,000 dollars";
			// System.out.println(bankAccount);
//		String birthMonth = input.next();
//		String bankAccount = " ";
//		switch (birthMonth) {
//		case "1":
//			bankAccount = " Your bank account will be  10,000,000 dollars.";
//		case "2":
//			bankAccount = " Your bank account will be  10,000,000 dollars.";
//		case "3":
//			bankAccount = " Your bank account will be  10,000,000 dollars.";
//		case "4":
//			bankAccount = " Your bank account will be  10,000,000 dollars.";
//			bankAccount = "10,000,000 dollars";
//			break;
//		case "5":
//			bankAccount = " Your bank account will be 5,000,000 dollars.";
//		case "6":
//			bankAccount = " Your bank account will be 5,000,000 dollars.";
//		case "7":
//			bankAccount = " Your bank account will be 5,000,000 dollars.";
//		case "8":
//			bankAccount = " Your bank account will be 5,000,000 dollars.";
//			bankAccount = "5,000,000 dollars";
//			break;
//		case "9":
//			bankAccount = " Your bank account will be 1,000,000 dollars.";
//		case "10":
//			bankAccount = " Your bank account will be 1,000,000 dollars.";
//		case "11":
//			bankAccount = " Your bank account will be 1,000,000 dollars.";
//		case "12":
//			bankAccount = " Your bank account will be 1,000,000 dollars.";
//			bankAccount = "1,000,000 dollars";
//			break;
//		default:
//			bankAccount = "0.00 dollars";
//
//		}
		}
	}

