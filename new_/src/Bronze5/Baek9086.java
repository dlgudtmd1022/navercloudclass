package Bronze5;

import java.util.Scanner;

public class Baek9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		

		int [] chess = {1, 1, 2, 2, 2, 8};
		
		int [] myChess = new int[chess.length];
		for(int i = 0;i < chess.length; i++) {
		myChess[i] = sc.nextInt();
		if(myChess[i] == chess[i]) {
			System.out.print(0 + " ");
		}else {
		System.out.print(chess[i] - myChess[i] + " ");
		}	
		}
	}
}
