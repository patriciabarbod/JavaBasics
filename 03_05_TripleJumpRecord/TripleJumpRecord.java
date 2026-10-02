public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		double NewRecord = Math.max(jump1, Math.max(jump2, Math.max(jump3, Math.max(jump4, record))));
		
		
		System.out.printf("The current record is now %.2f meters%n", NewRecord );
		
		
		System.out.printf("The current record is below %d meters%n", (int) Math.ceil(NewRecord));
		
		
		System.out.printf("The current record is above %d meters", (int) Math.floor(NewRecord));
		
		

	}

}