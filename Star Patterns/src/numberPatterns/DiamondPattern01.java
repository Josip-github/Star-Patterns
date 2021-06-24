package numberPatterns;

public class DiamondPattern01 {

	public static void main(String[] args) {

		/*
		 * 			1
		 * 		   222
		 * 		  33333
		 * 		 4444444
		 * 		555555555
		 * 		 6666666
		 * 		  77777
		 * 		   888
		 * 			9
		 */
		
		int n = 5, p = 1;
		
		for(int i = 1; i < n; i++, p++) {
			
			for(int j = i; j < n; j++) {
				System.out.print("  ");
			}
				
			for(int j = 1; j < i; j++) {
				System.out.print(p + " ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++, p++) {
			
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
				
			for(int j = i; j < n; j++) {
				System.out.print(p + " ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print(p + " ");
			}
			
			System.out.println();
		}
	}

}
