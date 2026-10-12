import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int firstInt = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter an operator (+, -, *, /, %):");
        String operator  = scan.nextLine();

        System.out.println("Enter the second integer:");
        int secondInt = scan.nextInt();

        int resultat = 0;

        if(operator.equals("+")) {

            resultat = firstInt + secondInt;
        } else if (operator.equals("-")) {

            resultat = firstInt - secondInt;
        } else if (operator.equals("*")) {

            resultat = firstInt * secondInt;
        } else if (operator.equals("/")) {

            if (secondInt == 0) {

                System.out.println("Error: Division by zero is not allowed");
                return;
            }

            resultat = firstInt / secondInt;
        } else if (operator.equals("%")) {

            if (secondInt == 0) {

                System.out.println("Error: Division by zero is not allowed");
                return;
            }

            resultat = firstInt % secondInt;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println(firstInt + " " + operator + " " + secondInt + " = " + resultat) ;
    
    
}
}