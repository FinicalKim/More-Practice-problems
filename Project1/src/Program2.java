import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
    	int num1 = input.nextInt();
    	
    	System.out.println("Enter the number 2: ");
		int num2 = input.nextInt();

		int option;
		do {
		
		System.out.println("Choose option 1 for addition");
		System.out.println("Choose option 2 for subtraction");
		System.out.println("Choose option 3 for multiplication");
		System.out.println("Choose option 4 for division");
		System.out.println("Choose option 5 for quit");
		
		option = input.nextInt();
		switch( option )
		{
		case 1:
			add(num1, num2);
			break;
		case 2:
			sub(num1, num2);
			break;
		case 3:
			mul(num1, num2);
			break;
		case 4:
			div(num1, num2);
		    break;
		case 5:
			break;
		default:
			System.out.print("Incorrect option");
			
		}
		
		}while(option != 5);
	}

	public static void add(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.print("The result of num1 + num2 = " + sum);
		
	}
	
	public static void sub(int num1, int num2)
	{
		int sum = num1 - num2;
		System.out.print("The result of num1 - num2 = " + sum);
		
	}
	
	
	public static void mul(int num1, int num2)
	{
		int sum = num1 * num2;
		System.out.print("The result of num1 * num2 = " + sum);
		
	}
	
	public static void div(int num1, int num2)
	{
		double sum = (double) num1 / num2;
		System.out.print("The result of num1 / num2 = " + sum);
		
	}
	
}
