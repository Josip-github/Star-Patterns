package numberPatterns;

public class IncreasingTriangle06 {

	public static void main(String[] args) {


		/*
		 * 	5
		 * 	54
		 * 	543
		 * 	5432
		 * 	54321
		 */
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			int p = 5;
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p-- + " ");
			}
			
			System.out.println();
		}
	}

}
