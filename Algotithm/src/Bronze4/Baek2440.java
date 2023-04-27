package Bronze4;

import java.util.Scanner;

public class Baek2440 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int u = scan.nextInt();
		
		scan.close();
		
		for (int i = u; i >= 1; i--) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
	}
}
