import java.util.*;
public class AreaRectangle{
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side A:");
		double sideA = scan.nextDouble();
		
		System.out.println("Enter side B:");
		double sideB = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("Enter units:");
		String units = scan.nextLine();
		
		double area = sideA * sideB;
		
		System.out.println("Area = " + area + " " + units + "^2");
		
		
		
	}
	
}