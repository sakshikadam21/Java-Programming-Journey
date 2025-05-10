import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year=scan.nextInt();
		
		if((year%4==0 && year!=100) ||year%400==0 ) {
			System.out.println("It is Leap Year");
			}
      
		else {
			System.out.println("It is not Leap Year");
		}
	}
}
