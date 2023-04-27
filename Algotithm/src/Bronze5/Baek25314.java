package Bronze5;

import java.util.Scanner;

public class Baek25314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
			int N = scan.nextInt();
			
			if(N % 4 == 0) {
			for(int i =0; i < N /4; i++) {		
			System.out.print("long ");
			}	
			System.out.println("int");
			}
}
}
