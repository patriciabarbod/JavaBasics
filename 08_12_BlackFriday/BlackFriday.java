import java.util.*;
public class BlackFriday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int discount = 0;
        System.out.println("Enter the price:");
        double price = scan.nextDouble();
        
        scan.nextLine();

        System.out.println("Do you have a loyalty card? (yes/no):");
        String loyalty = scan.nextLine();

        if (price > 60) {

            if (loyalty.equalsIgnoreCase("yes")) {

                discount = 20;
            } else {
                discount = 10;
            }

        } else {
            if (loyalty.equalsIgnoreCase("yes")) {

                discount = 5;
        }

        }

        price = price - (price * discount / 100);

        System.out.printf("Final price: %.2f €", price);
}
}
