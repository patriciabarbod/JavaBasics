import java.util.Scanner;
public class FilmDuration {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Frames per second (fps):");
        int fps = scan.nextInt();

        System.out.println("Duration of film in minutes:");
        int duration = scan.nextInt();

        scan.nextLine();

        System.out.println("Name of the film:");
        String nameFilm = scan.nextLine();

        int totalFrames = duration * 60 * fps;

        System.out.printf("Total frames of film \"%s\" is %d", nameFilm, totalFrames);




    }
}
