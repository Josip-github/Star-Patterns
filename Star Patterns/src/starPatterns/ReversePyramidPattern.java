package starPatterns;

public class ReversePyramidPattern {

	public static void main(String[] args) {

		
		/*
		 * 		* * * * *
		 * 		 * * * *
		 * 		  * * *
		 * 		   * *
		 * 			*
		 * 
		 */
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int k = 0; k < i - 1; k++) {
				System.out.print(" ");
			}
			
			for(int j = rows; j >= i; j--) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
	}

}
