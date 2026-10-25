import java.util.*;
public class CountEvens {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int num = 0;
        int count = 0;
        String numbers = "";

        while (num != -1) {
            System.out.println("Enter number:");
            num = scan.nextInt();

            if (num % 2 == 0) {
                count ++;
                numbers = numbers + num + " ";
            }

            

        }

        System.out.println("Even numbers: " + count);
        System.out.println("Numbers: " + numbers);
    }
}