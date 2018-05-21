//package fortuneteller;
//
//public class fortuneteller2 {
//	package fortuneteller;
//
//	import java.util.Scanner;
//
//	public class FortuneTellerApp {
//
//		public static void main(String[] args) {
//			Scanner input = new Scanner(System.in);
//
//			System.out.println("Hello, I am your Fortune Teller!");
//			System.out.println(" What is your first name? ");
//			String userFirstName = input.nextLine();
//			System.out.println(" Hello! I am the Great " + userFirstName + "!" + " Shocking we have the same first name!! "
//					+ " I can tell you your fortune if you will answer my questions. ");
//			System.out.println(
//					" Would you like your fortune to be told to you?" + " If not please write quit in the next line.");
//
//			System.out.println("What is your last name? ");
//			String userLastName = input.nextLine();
//			System.out.println("What is your age? ");
//			int userAge = input.nextInt();
//			String retirement;
//			if ((userAge % 2 == 0)) {
//				retirement = " 7 years !";
//			} else 
//				retirement = " 11 years! ";
//			
//
//			System.out.println("What is your birth month number 1 -12? ");
//
//			String birthMonth = input.next();
//			String bankAccount = " ";
//			 switch (birthMonth){
//			 case "1" :bankAccount= " Your bank account will be  10,000,000 dollars.";
//			 case "2" :bankAccount= " Your bank account will be  10,000,000 dollars.";
//			 case "3" :bankAccount= " Your bank account will be  10,000,000 dollars.";
//			 case "4" :bankAccount= " Your bank account will be  10,000,000 dollars.";
//				 bankAccount= " Your bank account will be  10,000,000 dollars.";
//				 break;
//			 case "5" :bankAccount=  " Your bank account will be 5,000,000 dollars.";
//			 case "6" :bankAccount=  " Your bank account will be 5,000,000 dollars.";
//			 case "7" :bankAccount=  " Your bank account will be 5,000,000 dollars.";
//			 case "8" :bankAccount=  " Your bank account will be 5,000,000 dollars.";
//				 bankAccount=  " Your bank account will be 5,000,000 dollars.";
//				 break;
//			 case "9" : bankAccount = " Your bank account will be 1,000,000 dollars.";
//			 case "10" : bankAccount = " Your bank account will be 1,000,000 dollars.";
//			 case "11" : bankAccount = " Your bank account will be 1,000,000 dollars.";
//			 case "12" : bankAccount = " Your bank account will be 1,000,000 dollars.";
//				 bankAccount = " Your bank account will be 1,000,000 dollars.";
//				 break;
//				 default:
//					 bankAccount = " I'm sorry, you will have 0.00 dollars";
//				 
//			 }
//
//			System.out.println("What is your favorite color from the ROYGBIV colors?");
//
//			String favRoygbivColor = input.nextLine();
//			String favColor = favRoygbivColor.toLowerCase();
//			 while (favRoygbivColor.equals("help")){
//					System.out.println(" The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet");
//			 favRoygbivColor = input.nextLine();	
//				} 
//			String car = "";
//
//			switch(favColor) {
//			 case "red" : car = "You will have a Jeep";
//			 break;
//			 
//			 case "orange" : car ="You will have a Elephant";
//				 break;
//			 case "yellow" : car = "You will have a Ford Mustang";
//			 break;
//				 
//			 case "green" : car = "You will have a private jet";
//			 break;
//				 
//			 case "blue" : car = "You will have a telsa teleporter";
//			 break;
//				 
//			 case "indigo" : car ="You will have a Rick and Morty portal gun";
//			 break;
//				 
//			 case "violet" : car = "You will have a jetpack";
//			 break;
//				 default:
//					 System.out.println("Please enter valid color");
//			 }
//
//			System.out.println("How many siblings do you have number format");
//
//			int siblingsNum = input.nextInt();
//			String vactionLand = " ";
//			
//			if (siblingsNum == 0) {
//				vactionLand = "Mar's City, Mars";
//			}
//			else if (siblingsNum == 1) {
//				vactionLand= "Hamburg, Germany"; 
//			}
//			else if (siblingsNum == 2) {
//				vactionLand= "Helsinki, Finland";
//			} 
//			else if (siblingsNum == 3) {
//			vactionLand = "Toronto, Canada";}
//			 else if (siblingsNum > 3)  {
//				 vactionLand = "Marrakesh, Morocco";
//			
//			 } else {
//				 vactionLand = " The Ice Wall, Westeros aka Flat Earth"; }
//			
//			System.out.println("" + userFirstName + "" + userLastName + " will retire in " + retirement + " " +  bankAccount + " in the bank " + " a vaction home in " + vactionLand + " , " + " and travel by " + car ); 
//			
//		
//			
//					
//			
//		}
//		
//			}
//}
