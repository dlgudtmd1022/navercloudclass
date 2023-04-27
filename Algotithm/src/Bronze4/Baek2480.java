package Bronze4;

import java.util.Scanner;

public class Baek2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] dice = new int[3];
		for(int i = 0; i < 3; i++) {
			dice[i] = scan.nextInt();
		}
		
		
		int result = 0;
		if((dice[0] == dice[1] && dice[0] == dice[2]) && dice[1] == dice[2]) {
			result = 10000 + dice[0]*1000;
		}else if (dice[0] == dice[1] || dice[0] == dice [2]) {
			result = 1000 + dice[0]*100;
		}else if (dice[1] == dice[2]) {
			result = 1000 + dice[1]*100;
		}else {
			result = Math.max(Math.max(dice[0],dice[1]),dice[2]) * 100;
		}
		System.out.println(result);
	}
}
