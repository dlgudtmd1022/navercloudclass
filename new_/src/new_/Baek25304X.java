package new_;

import java.util.Scanner;
public class Baek25304X {

	public static void main(String[] args) {
		
		        Scanner scan = new Scanner(System.in);
		        int X = scan.nextInt();
		        int N = scan.nextInt();
		        int total = 0;
		        for (int i = 0; i < N; i++) {
		            total += scan.nextInt() * scan.nextInt();
		        }
		        
		        System.out.println(total == X ? "Yes" : "No");
		        scan.close();
		 
	}
}
