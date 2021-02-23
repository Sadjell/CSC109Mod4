import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to add,  multiply, or divide?");
		System.out.println("Press 1 to add, 2 to multiply, or 3 to divide");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("Please enter a number");
		
		int userInput = scanner.nextInt();

		System.out.println("Enter another number.");
		int userInput2 = scanner.nextInt();

		if (choice == 1) {
			System.out.println("The result of " + userInput + " and " + userInput2 + " is " + (userInput+userInput2) + ".");
		}
		else if (choice == 2) {
			System.out.println("The product of " + userInput + " and " + userInput2 + " is " + (userInput*userInput2) + ".");
		}
		else if (choice == 3) {
			System.out.println("The quotient of " + userInput + " and " + userInput2 + " is " + (userInput/userInput2)+ ".");
		}
		


	}

}
