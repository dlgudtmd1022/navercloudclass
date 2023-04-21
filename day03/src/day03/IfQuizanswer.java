package day03;

public class IfQuizanswer {

	public static void main(String[] args) {
	
		/*
		 * int number = -3;
		 */
		
		/*if (number < 0) {
			System.out.println("음수입니다");
		} else if (number == 0) {
			System.out.println("0입니다.");
		} else if (number > 0 && (number % 2 == 0)) {
			System.out.println("짝수 양수입니다.");
		} else if (number > 0 && (number % 2 != 0)) {
			System.out.println("홀수 양수입니다.");
		}
		
	}
	
}
*/


		int number = 0;

		if(number < 0 ) {
			System.out.println("음수입니다");
		} else if (number == 0) { 
			System.out.println("0입니다!");
		} else {
			if(number % 2 == 0) {
				System.out.println("짝수 양수입니다.");
			}else if (number % 2 != 0 ) {
				System.out.println("홀수 양수입니다.");
			}
		}
	}

}