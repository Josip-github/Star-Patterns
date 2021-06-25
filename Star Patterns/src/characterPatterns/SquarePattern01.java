package characterPatterns;

public class SquarePattern01 {

	public static void main(String[] args) {

		/*
		 * ABCDE
		 * ABCDE
		 * ABCDE
		 * ABCDE
		 * ABCDE
		 */
		
		for(char z = 'A'; z <= 'E'; z++) {
			
			for(char ch = 'A'; ch <= 'E'; ch++) {
				System.out.print(ch + " ");
			}
			
			System.out.println();
		}
	}

}
