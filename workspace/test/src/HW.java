import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("Enter something:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(input);
		System.out.print("Enter first no.:");
		int num1 = scan.nextInt();
		System.out.println(num1);
		System.out.print("Enter second no.:");
		int num2 = scan.nextInt();
		System.out.println(num2);
		int num3 = num1 + num2;
		System.out.print("Sum = " + num3);

	}
}
