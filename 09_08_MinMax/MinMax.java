import java.util.*;

public class MinMax{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int count = 0;
        double num = 0;

        while(num >= 0) {

            System.out.println("Enter a positive double (negative number to finish):");
            num = scan.nextDouble();

            if (num >= 0) {

                max = num > max ? num : max;
                min = count == 0 ? num : (num < min ? num : min);
                count++;

            }

        }

        if (count == 0) {
            System.out.println("No numbers entered");
        } else {
            System.out.println("MINIM = " + min);
            System.out.println("MAXIM = " + max);
        
        }
    }
}