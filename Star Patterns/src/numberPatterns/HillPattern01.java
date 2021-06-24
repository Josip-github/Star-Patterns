package numberPatterns;

public class HillPattern01 {

	public static void main(String[] args) {

		/*
		 *			1
		 * 	 	   123
		 * 	  	  12345
		 * 	   	 1234567
		 * 	    123456789
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
				System.out.print(p++ + " ");
			}
			
			System.out.println();
		}
	}

}
