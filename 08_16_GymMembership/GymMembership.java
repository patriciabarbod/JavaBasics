import java.util.*;
public class GymMembership{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        final double ONE_GYM = 24.90;
        final double MULTI_GYM = 34.90;
        final double ALL_DAY = 7.50;
        final double POOL = 9.90;
        final double LOCKER = 9.90;
        final int DISCOUNT = 10;
        final double REGISTRATION_FEE = 12.50;
        double preuFinal = 0;
        double preuFinalDescontat = 0;
        double preuFinalPrimerMes = 0;
        double discountTotal = 0;


        boolean invalid = false;

        System.out.println("Choose your membership (One Gym / Multi Gym): ");
        String membership = scan.nextLine();

        if (membership.equalsIgnoreCase("one gym")) {
            preuFinal += ONE_GYM;
        } else if (membership.equalsIgnoreCase("multi gym")) {
            preuFinal += MULTI_GYM;
            System.out.println("Morning or all day?: ");
            String schedule = scan.nextLine();

            if (!schedule.equalsIgnoreCase("all day") && !schedule.equalsIgnoreCase("morning")) {
                invalid = true;
            } else {
                if (schedule.equalsIgnoreCase("all day")) {
                    preuFinal += ALL_DAY;
                }

                System.out.println("Will you use the pool/sauna (yes/no)?: ");
                String poolSauna = scan.nextLine();

                if(!poolSauna.equalsIgnoreCase("yes") && !poolSauna.equalsIgnoreCase("no")) {
                    invalid = true;
                } else {
                    if (poolSauna.equalsIgnoreCase("yes")) {
                        preuFinal += POOL;

                        System.out.println("Would you like to rent a locker (yes/no)?: ");
                        String locker = scan.nextLine();

                        if (!locker.equalsIgnoreCase("yes") && !locker.equalsIgnoreCase("no")) {
                            invalid = true;
                        } else {
                            if (locker.equalsIgnoreCase("yes")) {
                                preuFinal += LOCKER;
                            }
                        }

                    }

                }





            }


        } else {
        invalid = true;
        }

        if (invalid == false) {

            System.out.println("Did a friend recommend you (yes/no)?: ");
            String recommendation = scan.nextLine();

            if (recommendation.equalsIgnoreCase("yes")) {
                discountTotal = preuFinal * DISCOUNT / 100;
                
            } else if (!recommendation.equalsIgnoreCase("yes") && !recommendation.equalsIgnoreCase("no")) {
                invalid = true;
            }

            preuFinalDescontat = preuFinal - discountTotal;
            preuFinalPrimerMes = preuFinal + REGISTRATION_FEE;

            
        } 

        if (invalid == true) {
            System.out.println("Invalid option");
        } else {
            System.out.printf("Monthly fee: %.2f €%nDiscount: %.2f €%nTotal monthly fee: %.2f €%nRegistration fee: %.2f €%nFirst Month total: %.2f €", preuFinal, discountTotal, preuFinalDescontat, REGISTRATION_FEE, preuFinalPrimerMes);
        }

scan.close();

}
}