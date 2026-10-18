import java.util.*;

public class TemperatureSensor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter temperature from sensor 1:");
        int first = scan.nextInt();

        System.out.println("Enter temperature from sensor 2:");
        int second = scan.nextInt();

        System.out.println("Enter temperature from sensor 3:");
        int third = scan.nextInt();

        String resultat = "";

        if ((first < 30) && (second < 30) && (third < 30)) {

            if (first > second ) {

                if (first > third) {
                    resultat = "" + first;
                } else {
                    resultat = "" + third;
                }
            } else {
                if (second > third){
                    resultat = "" + second;
                } else {
                    resultat = "" + third;
                }
            }
                

        } else if (first < 30 && second < 30){
            if (first > second) {
                resultat = "" + first;
            } else {
                resultat = "" + second;
            }
            

        } else if (first < 30 && third < 30) {
            if (third > first) {
                resultat = "" + third;
            } else {
                resultat = "" + first;
            }

        } else if (second < 30 && third < 30) {

            if (second > third) {
                resultat = "" + second;
            } else {
                resultat = "" + third;
            }
                
        } else if (first < 30) {
            resultat = "" + first;
        } else if (second < 30) {
            resultat = "" + second;
        } else if (third < 30) {
            resultat = "" + third;
        } else {
            resultat = "ERROR";
        }
            System.out.println("Temperature: " + resultat);
        }


    }

