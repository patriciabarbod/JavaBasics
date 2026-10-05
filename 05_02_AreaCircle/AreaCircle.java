import java.util.*;
public class AreaCircle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius:");
		double radius = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("Enter units:");
		String units = scan.nextLine();
		
		double area = Math.PI * Math.pow(radius, 2);
	
		System.out.println("Area = " + area + " " + units + "^2" );
		
		
	}
	
}