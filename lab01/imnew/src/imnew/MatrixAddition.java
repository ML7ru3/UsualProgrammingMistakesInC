package imnew;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = input.nextInt();
		System.out.println("Enter the number of columns");
		int m = input.nextInt();
		int[][] mt1 = new int[n][m];
		int[][] sum = new int[n][m];
		System.out.println("Enter your first matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mt1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter your second matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int x = input.nextInt();
				sum[i][j] = mt1[i][j] + x;
			}
		}

		System.out.println("Here the sum of the 2 matrixes:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println("");
		}
		input.close();
	}
}
