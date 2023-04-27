package Bronze3;

import java.util.Scanner;

public class Baek2441{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
