import java.util.Scanner;
public class SolveEquation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		// first - degree equation
		double a = input.nextDouble();
		double b = input.nextDouble();
		if (a != 0) {
			double result = -b / a;
			System.out.println("The result of first - degree equation is " + result);
		}
		else {
			System.out.println("There is no result");
		}
		System.out.println("");

		// first - degree equation with 2 variables

		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		double c1 = input.nextDouble();
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();
		double c2 = input.nextDouble();
		double deter = a1 * b2 - a2 * b1;
		if (deter == 0) {
           		if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                		System.out.println("The system has infinitely many solutions."); 
			} else {
				System.out.println("The system has no solution.");
			}
		} else {
			double x = (c1 * b2 - c2 * b1) / deter;
			double y = (a1 * c2 - a2 * c1) / deter;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		System.out.println("");

		// second - degree equation

		a = input.nextDouble();
		b = input.nextDouble();
		double c = input.nextDouble();
		double delta  = b * b - 4 * a * c;
		if (delta > 0){
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The equation has 2 roots: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (delta == 0){
			double root =  -b / (2 * a);
			System.out.println("The equation have 1 root : " + root);
		} else {
			System.out.println("The equation have no root");
		}
		input.close();
	}
}

