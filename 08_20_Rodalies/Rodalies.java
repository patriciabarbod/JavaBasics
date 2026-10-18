import java.util.*;
public class Rodalies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double preu = 0;

        int numZonesTotals = 0;


        System.out.printf("=== PREU BITLLET DE RODALIES ===%nZona d'origen:%n");
        byte origen = scan.nextByte();
        if (origen > 6 || origen < 1) {

            System.out.println("Error: les zones han d'estar entre 1 i 6");

        } else {

            System.out.printf("Zona de destí:%n");
            byte desti = scan.nextByte();

            if (desti > 6 || desti < 1) {

                System.out.println("Error: les zones han d'estar entre 1 i 6");

            } else {
                System.out.printf("Tipus de transport:%n1. Bitllet senzill%n2. Anada i tornada%n3. Bonotren de 10 viatges%n4. Abonament mensual%nEscull una opció:%n");
                byte billet = scan.nextByte();

                if (billet < 1 || billet > 4) {

                    System.out.println("Error: l'opció seleccionada no és vàlida");

                } else {

                    numZonesTotals = (Math.abs(desti - origen)) + 1;
                
                    if (numZonesTotals == 1) {
                        if (billet == 1) {
                            preu = 2.90;
                        } else if (billet == 2) {
                            preu = 5.8;
                        }  else if (billet == 3) {
                            preu = 11.7;
                        }  else {
                            preu = 22.5;
                        }
                    } else if (numZonesTotals == 2) {
                        if (billet == 1) {
                            preu = 3.35;
                        } else if (billet == 2) {
                            preu = 6.7;
                        }  else if (billet == 3) {
                            preu = 18.6;
                        }  else {
                            preu = 35.45;
                        }

                    } else if (numZonesTotals == 3) {
                        if (billet == 1) {
                            preu = 4.55;
                        } else if (billet == 2) {
                            preu = 9.10;
                        }  else if (billet == 3) {
                            preu = 27.6;
                        }  else {
                            preu = 52.5;
                        }
                    } else if (numZonesTotals == 4) {
                        if (billet == 1) {
                            preu = 5.55;
                        } else if (billet == 2) {
                            preu = 11.0;
                        }  else if (billet == 3) {
                            preu = 35.8;
                        }  else {
                            preu = 67.54;
                        }
                    } else if (numZonesTotals == 5) {
                        if (billet == 1) {
                            preu = 6.6;
                        } else if (billet == 2) {
                            preu = 13.2;
                        }  else if (billet == 3) {
                            preu = 43.45;
                        }  else {
                            preu = 79.90;
                        }
                    } else {
                        if (billet == 1) {
                            preu = 8.25;
                        } else if (billet == 2) {
                            preu = 16.5;
                        }  else if (billet == 3) {
                            preu = 54.4;
                        }  else {
                            preu = 83.25;
                        }
                    } 
                
                    System.out.printf("Zones del trajecte: %d%nPreu: %.2f €", numZonesTotals, preu);

                }

            }

        }
    }

}
