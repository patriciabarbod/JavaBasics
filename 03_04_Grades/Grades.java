public class Grades {

	public static void main(String[] args) {
		float grade1 = 7.7f;
		float grade2 = 6.4f;
		float grade3 = 7.2f;

		// First, calculate the highest grade between grade1 and grade2
		float highest1And2 = Math.max(grade1, grade2);

		// Then, calculate the highest grade between highest1And2 and grade3
		float highestGrade = Math.max(grade3, highest1And2);

		// Calculate the rounded final grade
		int finalGrade = Math.round(highestGrade);

	    System.out.printf("Highest grade: %.1f%nFinal grade: %d", highestGrade, finalGrade);
        

    }

}