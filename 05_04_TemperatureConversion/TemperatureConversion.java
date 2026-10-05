import java.util.*;

public class TemperatureConversion{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter temperature in Celsius:");
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheits = tempCelsius * 9 / 5 + 32;

		System.out.printf("Fahrenheits = %.2f", tempFahrenheits);
	}
}