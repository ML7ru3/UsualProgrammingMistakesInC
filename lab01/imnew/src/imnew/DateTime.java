package imnew;

import java.util.Scanner;

public class DateTime {
	public static boolean CheckMonth(String month) {
		String[] fullname = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] NameWithMark = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.",
				"Nov.", "Dec." };
		String[] Name = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		String[] Number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		for (String x : fullname) {
			if (month.equals(x)) {
				return true;
			}
		}

		for (String x : NameWithMark) {
			if (month.equals(x)) {
				return true;
			}
		}

		for (String x : Name) {
			if (month.equals(x)) {
				return true;
			}
		}

		for (String x : Number) {
			if (month.equals(x)) {
				return true;
			}
		}
		return false;
	}

	public static boolean CheckYear(int year) {
		if (year <= 0)
			return false;
		return true;
	}

	public static boolean CheckLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static int Calc(String month, int year) {
		String[] fullname = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] NameWithMark = { "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.",
				"Nov.", "Dec." };
		String[] Name = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		String[] Number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int[] Days = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int check = 0;
		for (int i = 0; i < 12; i++) {
			if (month.equals(fullname[i])) {
				check = i;
				break;
			}
			if (month.equals(NameWithMark[i])) {
				check = i;
				break;
			}
			if (month.equals(Name[i])) {
				check = i;
				break;
			}
			if (month.equals(Number[i])) {
				check = i;
				break;
			}
		}
		if (check != 1) {
			return Days[check];
		} else if (CheckLeapYear(year)) {
			return 29;
		} else {
			return 28;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter month:");
		String month = input.next();
		while (CheckMonth(month) == false) {
			System.out.println("Invalid input! Please Try Again!");
			month = input.nextLine();
		}
		System.out.println("Please enter year:");
		int year = input.nextInt();
		while (CheckYear(year) == false) {
			System.out.println("Invalid input! Please Try Again!");
			year = input.nextInt();
		}

		System.out.println("This month has " + Calc(month, year) + " days");
		input.close();
	}

}
