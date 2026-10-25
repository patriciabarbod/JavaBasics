
import java.util.Scanner;

public class SumToX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        while (num <= 10) {
            System.out.println("Enter number > 10:");
            num = scan.nextInt();
        }

        int suma = (num * (num + 1)) / 2;
        System.out.println("Total = " + suma);
    }
}