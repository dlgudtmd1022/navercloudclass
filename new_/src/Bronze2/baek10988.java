package Bronze2;

import java.util.Scanner;


public class baek10988 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String trs = new StringBuilder(str).reverse().toString();
		if(str.equals(trs)) {
			System.out.println(1);
		}else {
				System.out.println(0);
		}
	}
}
