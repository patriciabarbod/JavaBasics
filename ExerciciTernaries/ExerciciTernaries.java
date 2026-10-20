public class ExerciciTernaries {
    public static void main(String[] args) {
        int x = 10;
        int result = 0;

        result = x > 0 ? 100 : -1;

        System.out.println("result = " + result);

        String solution = x != 0 && x > 100 ? "GOOD" : "BAD";

        System.out.println("Solution = " + solution);

        int x1 = 123;
        int resu = 0;

        resu = x1 == 0 ? 100 :
            (x1 > 0 && x1 < 100 ? 1000 : 10000);

        System.out.println("resu = " + resu);

    }
}