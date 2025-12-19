package programming;

import java.util.Scanner;
public class LeapYearChecker {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year = scan.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("It is a Leap Year");
		} else {
			System.out.println("It is not a Leap Year");
		}

		scan.close();
	}
}

//A year is a leap year if:
//It is divisible by 400
//OR
//It is divisible by 4 but not divisible by 100
