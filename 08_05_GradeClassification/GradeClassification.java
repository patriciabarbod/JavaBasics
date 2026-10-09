import java.util.*;

public class GradeClassification {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numeric grade (0-100):");

        int grade = scan.nextInt();

        String letterGrade = "";

        if (grade > 100 || grade < 0) {

            letterGrade = "Invalid grade";

        } else if (grade <= 100 && grade >= 90) {

            letterGrade = "A = Excellent";
        } else if (grade <= 89 && grade >= 70) {

            letterGrade = "B = Good";
        } else if (grade <= 69 && grade >= 60) {

            letterGrade = "C = Satisfactory";
        }else if (grade <= 59 && grade >= 50) {

            letterGrade = "D = Pass";
        } else if (grade <= 49 && grade >= 0) {

            letterGrade = "F = Fail";
        }

    System.out.println(letterGrade);
        
}

}