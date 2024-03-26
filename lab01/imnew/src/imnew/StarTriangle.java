package imnew;

import java.util.Scanner;

public class StarTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int stars = 1;
		while (n > 0) {
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println("");
			n--;
			stars += 2;
		}
		input.close();
	}
}
