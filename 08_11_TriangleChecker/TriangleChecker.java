import java.util.*;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the first side:");
        double a = scan.nextDouble();

        System.out.println("Enter the length of the second side:");
        double b = scan.nextDouble();

        System.out.println("Enter the length of the third side:");
        double c = scan.nextDouble();

        String triangleType = "";

        if ((a + b > c ) && (a + c > b) && (b + c > a)){

            if (a == b && b == c) {
                triangleType = "Equilateral";
            } else if (a == b || a == c || c == b) {
                triangleType = "Isosceles";

            } else {
                triangleType = "Scalene";
            }

            System.out.println("Type: " + triangleType);


        } else {
            System.out.println("The sides cannot form a triangle");
        }

            
    }
}