package self;
import java.util.Scanner;
public class Star2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = n; i >= 1 ; i--) {
			for(int  j = 1; j < i;j++) {					
			System.out.print(" ");
			}
			for(int k = n; k >= i;k--) {
			System.out.print("*");
			}
			System.out.println();
			}
	}
}
