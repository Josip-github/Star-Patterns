package numberPatterns;

public class HillPattern02 {

	public static void main(String[] args) {

		/*
		 *        1
		 *       121
		 *      12321
		 *     1234321
		 *    123454321
		 */
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			int p = 1;
			
			for(int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j < i; j++) {
				System.out.print(p++ + " ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p-- + " ");
			}
			
			System.out.println();
		}
	}

}
