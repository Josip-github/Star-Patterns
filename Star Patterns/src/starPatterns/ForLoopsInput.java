package starPatterns;

import javax.swing.JOptionPane;

public class ForLoopsInput {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Koliko zvjezdica želite u uzorku?")
				);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
