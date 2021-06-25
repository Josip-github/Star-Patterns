package numberPatterns;

public class FloydTriangle01 {

	public static void main(String[] args) {

		/*
		 * 1
		 * 23
		 * 456
		 * 78910
		 */
		
		int rows = 4, p = 1;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(p++ + " ");
			}
			
			System.out.println();
		}
	}

}
