import java.util.*;

public class SeriesMarathon {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalPause = 40;
		
		System.out.println("Enter episode 1 duration:");
		int duracioEpisodi1 = scan.nextInt();
		
		System.out.println("Enter episode 2 duration:");
		int duracioEpisodi2 = scan.nextInt();
		
		System.out.println("Enter episode 3 duration:");
		int duracioEpisodi3 = scan.nextInt();
		
		System.out.println("Enter episode 4 duration:");
		int duracioEpisodi4 = scan.nextInt();
		
		System.out.println("Enter episode 5 duration:");
		int duracioEpisodi5 = scan.nextInt();
		

		
		int duracioTotalMinuts = totalPause + duracioEpisodi1 + duracioEpisodi2 + duracioEpisodi3 + duracioEpisodi4 + duracioEpisodi5;
	    int duracioHores = duracioTotalMinuts / 60;
		int duracioMinuts = duracioTotalMinuts % 60;
		
	    System.out.printf("Total time: %d hours and %d minutes", duracioHores, duracioMinuts); 
		
	}
	
}