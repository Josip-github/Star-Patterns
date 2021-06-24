package numberPatterns;

public class DiamondPattern02 {

	public static void main(String[] args) {

		/*
		
		1
       222
      33333
     4444444
    555555555
     4444444
      33333
       222
        1

		 */
		
		int n = 5;
		
		for(int i = 1, p = 1; i < n; i++, p++) {
			
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
		
		for(int i = 1, p = 5; i <= n; i++, p--) {
			
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
