import java.util.*;
public class IncreasingSequence {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int biggestNum = 0;
        int num = 1;
        String numbers = "";

        while (num > biggestNum) {

            System.out.println("Enter number:");
            num = scan.nextInt();

            if (num > biggestNum) {
                biggestNum = num;
                numbers = numbers + num + " ";
                num ++;
            }


        }

        System.out.println("Sequence: " + numbers);

    }
}

