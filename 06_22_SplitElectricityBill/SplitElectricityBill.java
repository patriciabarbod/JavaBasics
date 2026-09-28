import java.util.Scanner;
import java.util.Locale;

public class SplitElectricityBill {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.UK);
		
		System.out.println("Number of people:");
		
		int numberOfPeople = scanner.nextInt();
		
		System.out.println("Enter electricity consumption (kWh):");
		
		double kWh = scanner.nextDouble();
		
		System.out.println("Enter price per kWh (€):");
		
		double priceKWh = scanner.nextDouble();
		
		System.out.println("Enter fixed monthly charge (€):");
		
		double monthlyCharge = scanner.nextDouble();
		
		System.out.println("Enter tax (%):");
		
		double tax = scanner.nextDouble();
		
		double cost = kWh * priceKWh;
		double subtotal = cost + monthlyCharge;
		double taxTotal = tax * subtotal / 100; 
		double total = subtotal + taxTotal;
		double totalPerson = total / numberOfPeople;
		
		
		System.out.printf(Locale.UK, "Energy cost = %.2f €%n", cost);
		System.out.printf(Locale.UK, "Fixed charge = %.2f €%n", monthlyCharge);
		System.out.printf(Locale.UK, "Subtotal = %.2f €%n", subtotal);
		System.out.printf(Locale.UK, "Tax = %.2f €%n", taxTotal);
		System.out.printf(Locale.UK, "Total = %.2f €%n", total);
		System.out.printf(Locale.UK, "Total per person = %.2f €%n", totalPerson);
		
	}
	
}