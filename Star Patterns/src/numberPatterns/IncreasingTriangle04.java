package numberPatterns;

public class IncreasingTriangle04 {

	public static void main(String[] args) {

		/*
		 * 	1
		 * 	22
		 * 	111
		 * 	2222
		 * 	11111
		 */
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				if (i % 2 != 0) {
					System.out.print(1 + " ");
				}else {
					System.out.print(2 + " ");
				}
				
			}
			
			System.out.println();
		}
	}

}
