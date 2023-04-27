package Bronze5;

import java.util.Scanner;

public class Baek11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
				
		for (int x = 1; x <= T;x++) {	
			int A = scan.nextInt();
			int B = scan.nextInt();		
			System.out.println("Case #" + x + ": " + (A + B));
			}
	    scan.close();
		}
}
