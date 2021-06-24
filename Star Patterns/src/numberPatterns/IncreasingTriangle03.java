package numberPatterns;

public class IncreasingTriangle03 {

	public static void main(String[] args) {

		/*
		 * 	0
		 * 	22
		 * 	444
		 * 	6666
		 * 	88888
		 */
		
		int rows = 5;
		
		for(int i = 1, p = 0; i <= rows; i++, p += 2) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			
			System.out.println();
		}
		
	}

}
