

import java.util.*;
public class FlightBaggage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalExtraCost = 0;

        boolean invalid = false;

        double maxAllowed = 0;



        System.out.printf("Enter fare type (Basic/Flex):%n");
        String fare = scan.nextLine();

        if (!(fare.equalsIgnoreCase("basic")) && !(fare.equalsIgnoreCase("flex"))) {

            invalid = true;

        } else if (fare.equalsIgnoreCase("basic")) {

            maxAllowed = 20.0;

        } else {
            maxAllowed = 25.0;
        }

        System.out.printf("Enter baggage weight (kg):%n");
        double weight = scan.nextDouble();

        System.out.printf("Enter baggage length (cm):%n");
        double length = scan.nextDouble();

        System.out.printf("Enter baggage width (cm):%n");
        double width = scan.nextDouble();

        System.out.printf("Enter baggage height (cm):%n");
        double height = scan.nextDouble();


        if(invalid == true) {
            System.out.println("Invalid data");
        } else {
            
            if (weight > maxAllowed) {
                totalExtraCost += Math.floor(weight - maxAllowed) * 10.0;
            }

            if (weight > 32) {
                totalExtraCost += 32;
            }

            if((length + width + height) > 158) {
                totalExtraCost += 35;
            }

            System.out.printf("Extra baggage cost: %.2f €", totalExtraCost);

        }

        
      
                     
    }

}

