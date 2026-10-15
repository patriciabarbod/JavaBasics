import java.util.*;

public class MovieRecommender {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Movie Recommender!");
        System.out.println("Do you like action movies? (yes/no):");
        String action = scan.nextLine();
         if (action.equalsIgnoreCase("yes")) {

            System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
            String superheroSpy = scan.nextLine();

            if (superheroSpy.equalsIgnoreCase("superhero")) {
                System.out.println("You should watch 'Avengers: Endgame'.");
            } else if (superheroSpy.equalsIgnoreCase("spy")) {
                System.out.println("You should watch 'Mission: Impossible Fallout'.");

            } else if (superheroSpy.equalsIgnoreCase("other")) {
                System.out.println("You should watch 'Mad Max: Fury Road'.");
            }
         } else {
            System.out.println("Do you like comedies? (yes/no):");
            String comedy = scan.nextLine();
            if (comedy.equalsIgnoreCase("yes")) {

                System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
                String smartSilly = scan.nextLine();

                if (smartSilly.equalsIgnoreCase("smart")) {
                    System.out.println("You should watch 'The Grand Budapest Hotel'.");
                } else if (smartSilly.equalsIgnoreCase("silly")) {
                    System.out.println("You should watch 'The Hangover'.");
                } else if(smartSilly.equalsIgnoreCase("other")) {
                    System.out.println("You should watch 'The Mask'.");
                }

            } else {
                 System.out.println("Do you like independent films? (yes/no):");
                 String independent = scan.nextLine();
                 
                 if (independent.equalsIgnoreCase("yes")) {

                    System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
                    String dramaExperimental = scan.nextLine();

                    if (dramaExperimental.equalsIgnoreCase("drama")) {
                        System.out.println("You should watch 'Lady Bird'.");
                    } else if (dramaExperimental.equalsIgnoreCase("experimental")) {
                        System.out.println("You should watch 'Everything Is Illuminated'.");
                    } else if (dramaExperimental.equalsIgnoreCase("other")) {
                        System.out.println("You should watch 'Moonlight'.");
                    }


                 } else {
                    System.out.println("You should watch 'Home Alone'.");
                 }
            }   

         }
        
    System.out.println("Thanks for using the Movie Recommender!");
}
}

