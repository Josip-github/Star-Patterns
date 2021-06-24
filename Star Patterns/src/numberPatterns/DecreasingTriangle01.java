package numberPatterns;

public class DecreasingTriangle01 {

	public static void main(String[] args) {

		/*
		 * 	12345
		 * 	 1234
		 * 	  123
		 * 	   12
		 * 	    1
		 */
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			int p = 1;
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
				
			for(int j = i; j <= rows; j++) {
				System.out.print(p++ +" ");
			}
			
			System.out.println();
		}
	}

}
