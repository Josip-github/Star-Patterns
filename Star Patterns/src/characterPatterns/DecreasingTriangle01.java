package characterPatterns;

public class DecreasingTriangle01 {

	public static void main(String[] args) {

		/*
		 * EEEEE
		 * DDDD
		 * CCC
		 * BB
		 * A
		 */
		
		for(char z = 'A', p = 'E'; z <= 'E'; z++,p--) {
			
			for(char ch = 'E'; ch >= z; ch--) {
				System.out.print(p + " ");
			}
			
			System.out.println();
		}
	}

}
