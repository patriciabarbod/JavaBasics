import java.util.*;

public class Scanner2 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		float mesAlt = 0;
		float mesBaix = 0;
		
		String ordre = "";
		
		for (int i = 0; i < 5; i++){
			
			
			if (i == 0 ){
				
				ordre = "first";
			
				} else if (i == 1 ){
				
				ordre = "second";
			} else if (i == 2 ){
				
				ordre = "third";
			} else if (i == 3 ){
				
				ordre = "fourth";
			} else if (i == 4 ){
				
				ordre = "fifth";
			}
			
			System.out.printf("Enter %s temp: %n", ordre);
			float temp = scan.nextFloat();
			if (i == 0) {
				mesBaix = temp;
			}
			mesAlt = Math.max(mesAlt, temp);
			mesBaix = Math.min(mesBaix, temp);
			
			
		}
		
		System.out.println("Max: " + mesAlt);
		System.out.println("Min: " + mesBaix);
		
		
	}
	
}