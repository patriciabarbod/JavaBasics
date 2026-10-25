import java.util.*;
public class CountText {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int iteration = 1;
        int textFound = 0;
        String textInput = "";

        System.out.println("Enter text to find:");
        String textToFind = scan.nextLine();

        while (iteration <= 10) {
            System.out.printf("Enter text (%d):%n", iteration);
            textInput = scan.nextLine();

            if (textInput.equalsIgnoreCase(textToFind)) {
               textFound ++;
            }

            iteration ++;
        }

        System.out.println("Count: " + textFound);
    }
}