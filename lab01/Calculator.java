import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double sum = num1 + num2;
		double diff = num1 - num2;
		double prod = num1 * num2;
		System.out.println("Sum: " + sum);
       		System.out.println("Difference: " + diff);
        	System.out.println("Product: " + prod);
        	if (num2 != 0) {
			double quot = num1 / num2;
			System.out.println("Quotient: " + quot);
		}
		else {
			System.out.println("Division is not possible");
		}
	}
}
