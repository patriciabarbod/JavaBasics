import java.util.*;

public class PasswordCheck {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        final String PASSWORD = "jupiter4321";

        System.out.println("Enter your password:");
        String pass = scan.nextLine();

        if (pass.equals(PASSWORD)) {

            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Incorrect password. Try again.");
            System.out.println("Enter your password:");
            pass = scan.nextLine();

            if (pass.equals(PASSWORD)) {

                System.out.println("Access granted. Welcome!");
            } else {
                System.out.println("Incorrect password. Try again.");
                System.out.println("Enter your password:");
                pass = scan.nextLine();

                if (pass.equals(PASSWORD)) {

                    System.out.println("Access granted. Welcome!");
                } else {

                    System.out.println("Your account is locked. Please contact your administrator.");
                }

             }

        }

    
}
}