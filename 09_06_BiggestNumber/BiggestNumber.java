import  java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int num = 0;

        System.out.println("Enter positive numbers. Enter a negative number to finish:");
        

        while(num >= 0) {
            num = scan.nextInt();

            max = num > max ? num : max;
    
            count ++;
        }

        if (count == 1) {
           System.out.println("No positive numbers were entered"); 
        } else {
            System.out.println("The biggest number is: " + max);
        }

        scan.close();
    }
}