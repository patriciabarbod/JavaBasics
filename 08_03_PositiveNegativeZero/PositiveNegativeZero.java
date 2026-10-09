import java.util.*;
public class PositiveNegativeZero{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = scan.nextInt();

        String numType = "";
        
        if(num > 0) {
            numType = "positive";
        } else if (num < 0) {
            numType = "negative";
        } else {
            numType = "zero";
        }

        System.out.printf("The number %d is %s", num, numType);
    }


}