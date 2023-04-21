package day03r;

public class If {
	public static void main(String[] args) {
		int number = ((int)(Math.random() * 10000));
 
		if(number <= 5000) {
			System.out.println(number);
			System.out.println("상품 C에 당첨되었습니다");
		} else if (number <= 1000) {
			System.out.println(number);
			System.out.println("상품 B에 당첨되었습니다.");
		} else if (number <= 100) {
			System.out.println(number);
			System.out.println("상품 A에 당첨되었습니다.");
	 	} else {
	 		System.out.println(number);
	 		System.out.println("경 축");
	 	}
 }
}
