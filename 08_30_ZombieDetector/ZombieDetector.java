import java.util.*;
public class ZombieDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter body temperature:");
        double temp = scan.nextDouble();

        String zombie = temp >= 30 ? "Human detected!" : "Zombie detected!";
        System.out.println(zombie);


    }
}