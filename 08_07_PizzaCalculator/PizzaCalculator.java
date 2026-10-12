import  java.util.*;
public class PizzaCalculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the diameter of the first pizza (cm):");
        int pizza1 = scan.nextInt();

        System.out.println("Enter the diameter of the second pizza (cm):");
        int pizza2 = scan.nextInt();

        System.out.println("Enter the diameter of the third pizza (cm):");
        int pizza3 = scan.nextInt();

        if (pizza1 == pizza2 && pizza2 == pizza3) {
            System.out.println("All pizzas have the same size.");
        } else if (pizza1 != pizza2 && pizza2 != pizza3 && pizza1 != pizza3) {
            System.out.println("All pizzas have different sizes.");
        } else {
            System.out.println("Two pizzas have the same size.");
        }

        scan.close();
    }
}
