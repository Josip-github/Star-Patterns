package numberPatterns;

public class IncreasingTriangle02 {

	public static void main(String[] args) {

		/*
		 * 	5
		 * 	44
		 * 	333
		 * 	2222
		 * 	11111
		 */
		
		int rows = 5;
		
		for(int i = 1, p = 5; i <= rows; i++, p--) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			
			System.out.println();
		}
	}

}
