import java.util.*;
public class HighestScore{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

     int highestScore = 0;

    System.out.println("Enter the score of the first player:");
    int score1 = scan.nextInt();

    if (score1 > highestScore) {
        highestScore = score1;
    }

    System.out.println("Enter the score of the second player:");
    int score2 = scan.nextInt();

     if (score2 > highestScore) {
        highestScore = score2;
    }

    System.out.println("Enter the score of the third player:");
    int score3 = scan.nextInt();

     if (score3 > highestScore) {
        highestScore = score3;
    }

    System.out.println("Enter the score of the fourth player:");
    int score4 = scan.nextInt();

     if (score4 > highestScore) {
        highestScore = score4;
    }


    System.out.println("The highest score is: " + highestScore);

}

}