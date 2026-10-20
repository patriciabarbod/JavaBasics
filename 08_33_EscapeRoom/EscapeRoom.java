
import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of keys:");
        int nkeys = scan.nextInt();
        scan.nextLine();
        System.out.println("Final riddle solved? (true/false)");
        String riddle = scan.nextLine();

        String result = nkeys < 3 ? "Not enough keys! Still trapped!" :
            (riddle.equalsIgnoreCase("true") ? "Door unlocked! Escape successful!" : "Door unlocked! Still trapped!");

        System.out.println(result);
    }
}