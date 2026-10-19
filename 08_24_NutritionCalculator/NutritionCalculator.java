import java.util.*;
public class NutritionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Nutrition calculator:%n1. Calculate calories%n2. Calories per serving%n3. Daily calories%nChoose an option:%n");
        byte option = scan.nextByte();
        switch (option) {
            case 1:
                System.out.println("Enter protein (g):");
                double protein = scan.nextDouble();

                System.out.println("Enter carbohydrates (g):");
                double carbs = scan.nextDouble();

                System.out.println("Enter fat (g):");
                double fat = scan.nextDouble();

                double totalCalories = (protein * 4) + (carbs * 4) + (fat * 9);

                System.out.printf("Total calories: %.2f kcal", totalCalories);

                break;
            case 2:

                System.out.println("Enter calories per 100 g:");
                double calorie100 = scan.nextDouble();

                System.out.println("Enter serving size (g):");
                double servingSize = scan.nextDouble();

                double caloriePerServing = (servingSize / 100) * calorie100;

                System.out.printf("Calories per serving: %.2f kcal", caloriePerServing);

                break;
                
            case 3:

                System.out.println("Enter age (years):");
                int age = scan.nextInt();

                System.out.println("Enter height (cm):");
                double height = scan.nextDouble();
                
                System.out.println("Enter weight (kg):");
                double weight = scan.nextDouble();

                scan.nextLine();

                System.out.println("Enter sex (M/F):");
                String sex = scan.nextLine();
                
                System.out.println("Enter activity factor (1.2 to 1.9):");
                double activity = scan.nextDouble();

                int genderVariable = switch (sex) {
                    case "M" ->  5;
                    case "F" -> -161;
                    default -> 0;
                };

                double dailyCalories = ((10 * weight) + (6.25 * height) - (5 * age) + genderVariable) * (activity);

                System.out.printf("Daily calories: %.2f kcal", dailyCalories);




        }
    }
}