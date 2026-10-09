import java.util.*;

public class Podium {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the score of the first athlete:");
        int score1 = scan.nextInt();

         System.out.println("Enter the score of the second athlete:");
        int score2 = scan.nextInt();

         System.out.println("Enter the score of the third athlete:");
        int score3 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter \"asc\" or \"desc\":");
        String order = scan.nextLine();
        

        if (score2 > score1) {

                int temp = score1;
                score1 = score2;
                score2 = temp;
        } 
        
         if (score3 > score1) {

            int temp = score1;
            score1 = score3;
            score3 = temp;

        }
        if (score2 < score3) {

                int temp = score3;
                score3 = score2;
                score2 = temp;
                
        }

      
        if (order.equalsIgnoreCase("desc")) {

            System.out.println("Podium: " + score1 + " " + score2 + " " + score3);
        } else if (order.equalsIgnoreCase("asc")) {
            System.out.println("Podium: " + score3 + " " + score2 + " " + score1);
        }

        
}

}