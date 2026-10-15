import java.util.*;
public class CovidTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pocProbable = "Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.";
        String probable = "Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.";
        String resultat = "";

        System.out.println("Tens febre? (sí/no):");
        String febre = scan.nextLine();

        if (febre.equalsIgnoreCase("si") || febre.equalsIgnoreCase("sí")) {

            System.out.println("També tens tos? (sí/no):");
            String tos = scan.nextLine();

            if (tos.equalsIgnoreCase("si") || tos.equalsIgnoreCase("sí")) {
                System.out.println("Et sents cansat o dèbil? (sí/no):");
                String cansat = scan.nextLine();

                if (cansat.equalsIgnoreCase("si") || cansat.equalsIgnoreCase("sí")) {
                    resultat = probable;
                } else {

                    System.out.println("Tens dificultat per respirar? (sí/no):");
                    String dificultatRespirar = scan.nextLine();

                    if (dificultatRespirar.equalsIgnoreCase("si") || dificultatRespirar.equalsIgnoreCase("sí")) {
                        resultat = probable;

                    } else {
                        resultat = pocProbable;
                    }

                }


            } else {

                System.out.println("Tens mal de coll o mal de cap? (sí/no):");
                String malCap = scan.nextLine();

                if (malCap.equalsIgnoreCase("si") || malCap.equalsIgnoreCase("sí")) {
                    resultat = probable;
                } else {
                    resultat = pocProbable;
                }

            }
            
        } else {

            System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
            String olfacte = scan.nextLine();

            if (olfacte.equalsIgnoreCase("si") || olfacte.equalsIgnoreCase("sí")) {
                resultat = probable;
            } else {

                System.out.println("Tens congestió nasal o mocs? (sí/no):");
                String congestio = scan.nextLine();

                resultat = pocProbable;

            }


        }

        System.out.println(resultat);

    }
}