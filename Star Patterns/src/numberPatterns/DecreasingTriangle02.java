package numberPatterns;

public class DecreasingTriangle02 {

	public static void main(String[] args) {

		/*
		 * 	54321
		 * 	 4321
		 * 	  321
		 * 	   21
		 * 	    1
		 */
		
		int rows = 5;
		
		for(int i = 1, k = rows; i <= rows; i++,k--) {
			
			int p = k;
			
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <= rows; j++) {
				System.out.print(p-- + "");
			}
			
			System.out.println();
		}
	}

}
