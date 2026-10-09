    import java.util.*;

    public class CoffeeMachine{

        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);

            System.out.println("Monthly electricity cost:");
            double electricityCost = scan.nextDouble();

            System.out.println("Monthly coffee machine rental cost:");
            double machineRental = scan.nextDouble();

            System.out.println("Number of coffees:");
            int nCoffees = scan.nextInt();

            System.out.println("Average coffee price:");
            double coffeePrice = scan.nextDouble();

            System.out.println("Coffee price per kilo:");
            double kiloPrice = scan.nextDouble();

            System.out.println("Kilograms of coffee:");
            int kgCoffee = scan.nextInt();

            System.out.println("Milk price per litre:");
            double milkPrice = scan.nextDouble();

            System.out.println("Liters of milk:");
            double litersMilk = scan.nextDouble();

            boolean shouldIBuyIt = (electricityCost + machineRental + (kiloPrice * kgCoffee) + (milkPrice * litersMilk)) < nCoffees * coffeePrice;
            System.out.println("Should we buy the coffee machine? " + shouldIBuyIt);


        }

    }