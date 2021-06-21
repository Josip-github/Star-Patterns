package starPatterns;

public class DiamondPattern {

	public static void main(String[] args) {

		// Hill pattern + reverse hill pattern
		// samo jednu promjenu je potrebno napraviti:
		// u outer loopu prvog for loopa ne ide se do i <= n,
		// nego i < n, kako bi se dobili šiljasti krajevi na lijevoj i desnoj strani
		
		int n = 5;
		
		for(int i = 1; i < n; i++) {
			
			for(int j = i; j < n; j++) {
				System.out.print("  ");
			}
				
			for(int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
				
			for(int j = i; j < n; j++) {
				System.out.print("* ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
