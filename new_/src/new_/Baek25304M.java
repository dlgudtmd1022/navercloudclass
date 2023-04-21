package new_;

import java.util.Scanner;

public class Baek25304M {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int N = scan.nextInt();
		
		int[] prices = new int[N];
		int[] counts = new int[N];
		int total = 0;
		
		for(int i = 0; i < N; i++) {
			prices[i] = scan.nextInt();
			counts[i] = scan.nextInt();
			total += prices[i]*counts[i];			
		}
		
		
		if(X == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scan.close();
	}
}
