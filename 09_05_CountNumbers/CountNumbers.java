import java.util.*;
public class CountNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");
        
        while (number != -1) {
            number = scan.nextInt();
        
            switch (number) {
                case 0:
                    count0 ++;  
                    break;
                case 1:
                    count1 ++;     
                    break;
                case 2:
                    count2 ++;    
                    break;
                case 3:
                    count3 ++;    
                    break;
                case 4:
                    count4 ++;    
                    break;
                case 5:
                    count5 ++;    
                    break;
                case 6:
                    count6 ++;    
                    break;
                case 7:
                    count7 ++;    
                    break;
                case 8:
                    count8 ++;    
                    break;
                case 9:
                    count9 ++;;    
                    break;
                case -1:
                    break;
                default: 
                    System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
       
            }

        }

        System.out.printf("Total 0: %d%nTotal 1: %d%nTotal 2: %d%nTotal 3: %d%nTotal 4: %d%nTotal 5: %d%nTotal 6: %d%nTotal 7: %d%nTotal 8: %d%nTotal 9: %d", count0, count1, count2, count3, count4, count5, count6, count7, count8, count9);
    }

}