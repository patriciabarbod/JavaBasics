import java.util.Scanner;

	public class Scanner1{
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter first price:");
			
			int firstPrice = scan.nextInt();
			
			System.out.println("Enter second price:");
			
			int secondPrice = scan.nextInt();
			
			System.out.println("Enter third price:");
			
			int thirdPrice = scan.nextInt();
			
			System.out.println("Enter fourth price:");
			
			int fourthPrice = scan.nextInt();
			
			System.out.println("Enter fifth price:");
			
			int fifthPrice = scan.nextInt();
			
			int total = firstPrice + secondPrice + thirdPrice + fourthPrice + fifthPrice;
			
			double average = (double) total / 5;
			
			System.out.println("Total price: " + total);
			System.out.println("Average: " + average);
		}

}