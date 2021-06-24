package numberPatterns;

public class IncreasingTriangle {

	public static void main(String[] args) {

		/*
		 * 	1
		 * 	22
		 * 	333
		 * 	4444
		 * 	55555
		 */
		
		int rows = 5;
		
		for(int i = 1, p = 1; i <= rows; i++, p++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}

}
