import java.util.*;
public class LeapYear{
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year:");

		int year = scan.nextInt();

		boolean leapYear = false;

		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			leapYear = true;
		}

		System.out.println(leapYear);

		
		scan.close();
	}
	
}