package numberPatterns;

public class DiamondPattern03 {

	public static void main(String[] args) {

		/*
		 *     1
		 *    123
		 *   12345
		 *  1234567
		 * 123456789
		 *  1234567
		 *   12345
		 *    123
		 *     1                 
		 */
		
		int n = 5;
		
		for(int i = 1; i < n; i++) {
			
			int p = 1;
			
			for(int j = i; j < n; j++) {
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
		
		for(int i = 1; i <= n; i++) {
			
			int p = 1;
			
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
				
			for(int j = i; j < n; j++) {
				System.out.print(p++ + " ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print(p++ + " ");
			}
			
			System.out.println();
		}
	}

}
