import java.util.*;
public class Scanner3{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter street number:");
		int streetNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter street name:");
		String streetName = scan.nextLine();
		
		System.out.println("Enter city:");
		String city = scan.nextLine();
		
		System.out.println("Enter country:");
		String country = scan.nextLine();
		
		System.out.println("Enter postal code:");
		String postalCode = scan.nextLine();
		
		System.out.printf("Your adress is:%n%d %s%n%s%n%s%n%s", streetNum, streetName, city, postalCode, country);
		
	}
} 