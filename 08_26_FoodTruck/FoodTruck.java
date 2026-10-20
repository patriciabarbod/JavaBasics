import java.util.*;

public class FoodTruck {
    public static void main(String[] args) {

        double preuMain = 0;
        double preuSide = 0;
        double preuBeguda = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice (burger/tacos/pizza):");
        String choice = scan.nextLine().toLowerCase();

        preuMain = switch (choice) {
            case "burger" -> 10.50;
            case "tacos" -> 8.50;
            case "pizza" -> 12.50;
            default -> 0.0;
        };

        if (preuMain == 0.0) {
            System.out.println("Invalid choice");
        } else {

            switch (choice) {
                case "burger":
                    System.out.println("Fries size? (large/small):");
                    String friesSize = scan.nextLine().toLowerCase();

                    preuSide = switch (friesSize) {
                        case "large" -> 4.50;
                        case "small" -> 3.75;
                        default -> 0.0;
                    };
                    break;

                case "tacos":
                    System.out.println("Sauce? (cheese/guacamole):");
                    String sauce = scan.nextLine().toLowerCase();

                    preuSide = switch (sauce) {
                        case "cheese" -> 2.50;
                        case "guacamole" -> 2.60;
                        default -> 0.0;
                    };
                    break;

                case "pizza":
                    System.out.println("Topping? (pepperoni/carbonara):");
                    String topping = scan.nextLine().toLowerCase();

                    preuSide = switch (topping) {
                        case "pepperoni" -> 3.5;
                        case "carbonara" -> 3.3;
                        default -> 0.0;
                    };
                    break;
            }

            if (preuSide == 0.0) {
                System.out.println("Invalid choice");
            } else {

                System.out.println("Choose your drink (soft/beer/water):");
                String beguda = scan.nextLine().toLowerCase();

                preuBeguda = switch (beguda) {
                    case "soft" -> 3.50;
                    case "beer" -> 5.50;
                    case "water" -> 2.20;
                    default -> 0.0;
                };

                if (preuBeguda == 0.0) {
                    System.out.println("Invalid choice");
                } else {
                    double preuTotal = preuBeguda + preuMain + preuSide;
                    System.out.printf("Total: %.2f €", preuTotal);
                }
            }
        }

        scan.close();
    }
}
