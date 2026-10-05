import java.util.*;

public class Coins {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the ammount of money:");
		
		double ammountEuros = scan.nextDouble();
		
		int ammountCents = (int)(ammountEuros * 100);
		
		int coin1Euro = ammountCents / 100;
		//ammountCents = ammountCents - (coin1Euro * 100); 
		ammountCents = ammountCents % 100;
		
		int coin50Cent = ammountCents / 50;
		//ammountCents = ammountCents - (coin50Cent * 50);
		ammountCents = ammountCents % 50;
		
		int coin20Cent = ammountCents / 20;
		//ammountCents = ammountCents - (coin20Cent * 20);
		ammountCents = ammountCents % 20;
		
		int coin10Cent = ammountCents / 10;
		//ammountCents = ammountCents - (coin10Cent * 10);
		ammountCents = ammountCents % 10;
		
		int coin5Cent = ammountCents / 5;
		//ammountCents = ammountCents - (coin5Cent * 5);
		ammountCents = ammountCents % 5;
		
		int coin1Cent = ammountCents;
		
		System.out.printf("1 euro coins: %d%n50 cent coins: %d%n20 cent coins: %d%n10 cent coins: %d%n5 cent coins: %d%n1 cent coins: %d", coin1Euro, coin50Cent, coin20Cent, coin10Cent, coin5Cent, coin1Cent);
		
		
		
		
		
		
		
	}
	
	
	
}