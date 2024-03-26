package imnew;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);
		System.out.println("Here's the sorted array: ");
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println("");
		double avg = (sum * 1.0) / n;
		System.out.println("The sum of the array is: " + sum);
		System.out.println("The average of the array is: " + avg);
		input.close();
	}
}
