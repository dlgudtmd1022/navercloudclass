package Bronze5;

import java.util.Scanner;

public class Baek2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
					
		int n = scan.nextInt();
		scan.close();
		 for (int i = 1; i <= n; i++) {
		 for (int j = 1; j <= i; j++) {
			System.out.print("*");
		 }
			System.out.println();
		}
	}
}
