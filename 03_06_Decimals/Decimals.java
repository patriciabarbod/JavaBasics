public class Decimals {
	
	public static void main (String[] args) {
		
		double valorDecimal = 12.3456789;
		
		double resultat0 = Math.round(valorDecimal * Math.pow(10,0)) / Math.pow(10,0);
		
		double resultat2 = Math.round(valorDecimal * Math.pow(10,2)) / Math.pow(10,2);
		
		double resultat4 = Math.round(valorDecimal * Math.pow(10,4)) / Math.pow(10,4);
		
		double resultat6 = Math.round(valorDecimal * Math.pow(10,6)) / Math.pow(10,6);
		
		System.out.printf("Rounded to 0 decimals: %d%n", (int)resultat0);
		System.out.printf("Rounded to 2 decimals: %.2f%n", resultat2);
		System.out.printf("Rounded to 4 decimals: %.4f%n", resultat4);
		System.out.printf("Rounded to 6 decimals: %.6f%n", resultat6);
		
		
	}
	
}