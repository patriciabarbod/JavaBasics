import java.util.*;
public class EvenOdd{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = scan.nextInt();
    String oddEven = "";

    if (num % 2 == 0) {
        oddEven = "even";
    } else {
        oddEven = "odd"; 
    }

    System.out.printf("The number %d is %s", num, oddEven);

}

}