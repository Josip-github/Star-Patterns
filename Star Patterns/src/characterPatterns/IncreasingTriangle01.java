package characterPatterns;

public class IncreasingTriangle01 {

	public static void main(String[] args) {

		/*
		 * a
		 * ba
		 * cba
		 * dcba
		 * edcba
		 */
		
		//int rows = 5;
		
		for(char z = 'a'; z <= 'e'; z++) {
			
			for(char ch = z; ch >= 'a'; ch--) {
				System.out.print( ch );
			}
			
			System.out.println();
		}
	}

}
