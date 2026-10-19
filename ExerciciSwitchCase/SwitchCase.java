import java.util.*;
public class SwitchCase{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escull el dia de la setmana:");
        int nDia = scan.nextInt();
        String diaText = switch (nDia) {
            case 1 -> "dilluns";
            case 2 -> "dimarts";
            case 3 -> "dimecres";
            case 4 -> "dijous";
            case 5 -> "divendres";
            case 6 -> "dissante";
            case 7 -> "diumenge";
            default -> "dia incorrecte";
        };

        System.out.println(diaText);
        /*switch (nDia) {
            case 1 : 
                System.out.println("dilluns");
                break;
            case 2 : 
                System.out.println("dimarts");
                break;
            case 3 : 
                System.out.println("dimecres");
                break;
            case 4 : 
                System.out.println("dijous");
                break;
            case 5 : 
                System.out.println("divendres");
                break;
            case 6 : 
                System.out.println("dissabte");
                break;
            case 7: 
                System.out.println("diumenge");
                break;
            default: 
                System.out.println("dia desconegut");
                
        }
        */

        scan.nextLine();
        System.out.println("Ara introdueix el dia de la setmana escrit:");
        String diaSetmana = scan.nextLine().toLowerCase();

        switch (diaSetmana) {
            case "dilluns":
                System.out.println(1);
                break;
            case "dimarts":
                System.out.println(2);
                break;
            case "dimecres":
                System.out.println(3);
                break;
            case "dijous":
                System.out.println(4);
                break;
            case "divendres":
                System.out.println(5);
                break;
            case "dissabte":
                System.out.println(6);
                break;
            case "diumenge":
                System.out.println(7);
                break;
                
            default:
                System.out.println("dia desconegut");
        }
    }
}