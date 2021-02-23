import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to add, substract, multiply, or divide?");
		System.out.println("Press 1 to add, 2 to substract, 3 to multiply, or 4 to divide");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("Please enter a number");
		
		int userInput = scanner.nextInt();

		System.out.println("Enter another number.");
		int userInput2 = scanner.nextInt();

		
		System.out.println("The product of " + userInput + " and " + userInput2 + " is " + userInput*userInput2 + ".");



	}

}
