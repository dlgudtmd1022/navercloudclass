package self;

import java.util.Scanner;
public class Star3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		
		for(int i = 0; i <= n; i++) {
			for(int k = i; k < n; k++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
