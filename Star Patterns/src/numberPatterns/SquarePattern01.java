package numberPatterns;

public class SquarePattern01 {

	public static void main(String[] args) {

		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		int rows = 5;
		
		for(int i = 1, p = 1; i <= rows; i++, p++) {
			
			
			
			for(int j = 1; j <= rows; j++) {
				System.out.print(p + " ");
			}
			
			System.out.println(); 
		}
	}

}
