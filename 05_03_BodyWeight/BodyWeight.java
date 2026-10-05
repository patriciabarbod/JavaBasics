import java.util.Scanner;
public class BodyWeight {

    public static void main(String[] args) {

        // Constants
        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        // Create the Scanner
		
		Scanner scan = new Scanner(System.in);

        // Request the input  (2 integers)
		
		System.out.println("Enter your height in cm:");
		int height = scan.nextInt();
		
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		
		// Calculate the body weight for men
		
		double bodyweightMen = height - 100.0 - (height - 150.0) / 4.0 + (age - 20.0) / K_MEN;

        // Display the body weight for men
		
		System.out.printf("Ideal Body Weight for Men = %.2fkg%n", bodyweightMen);

        // Calculate the body weight for women
		
		double bodyweightWomen = height - 100.0 - (height - 150.0) / 4.0 + (age - 20.0) / K_WOMEN;
		
        System.out.printf("Ideal Body Weight for Women = %.2fkg", bodyweightWomen);

        scan.close();

    }

}