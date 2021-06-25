package characterPatterns;

public class IncreasingTrianlge02 {

	public static void main(String[] args) {

		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 */
		
		for(char z = 'A'; z <= 'E'; z++){
			
			for(char ch = 'A'; ch <= z; ch++){
				System.out.print( ch + " ");
			}
			
			System.out.println();
		}
	}

}
