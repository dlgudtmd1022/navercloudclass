package day03r;

public class Ifr {

	public static void main(String[] args) {
		
		int number = 0;
		
		if(number < 0) { 
			System.out.println("음수");
		} else if (number == 0) {
			System.out.println("0");
		} else {
			if(number > 0 && number % 2 == 0) {
				System.out.println("짝수 양수");
			} else if(number > 0 && number % 2 == 1)
			System.out.println("홀수 양수");
		}
		
	}
}
