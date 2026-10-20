import java.util.*;
public class ParkTicket {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Is it a weekday? (true/false)");
        String weekday = scan.nextLine();

        double price = age < 12 ? (weekday.equalsIgnoreCase("true") ? 5.00 : 9.00) :
            (weekday.equalsIgnoreCase("true") ? 15.00 : 22.00);

        System.out.printf("Ticket price: %.2f €", price);
    }
}