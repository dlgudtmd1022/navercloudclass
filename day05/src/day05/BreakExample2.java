package day05;

import java.util.Scanner;

public class BreakExample2 {
	public static void main(String[] args) {
		// 1. 난수 2개를 발생시켜주세요. 단, 난수는 1 ~ 10범위로 두 개 만들어주세요.
		
		// 2. while문을 무한루프로 만들어주시고, 위에서 발생된 난수 2개를
		// 	a * b 의 답은? 이라고 질문해서 문제를 출제하게 해 주세요.
		
		// 3. if문으로 비교해 정답 시 break로 루프문을 빠져나오고
		//    오답인경우 "오답입니다"라는 멘트와 함께 답은 재 입력받도록 해주세요.
		Scanner sc = new Scanner(System.in);
		int answer = -1;
			
		int x = (int)(Math.random()*10) + 1;
		int y = (int)(Math.random()*10) + 1;
		
		while(1 == 1) {
			System.out.println(x + " * " + y +"의 답은?");
			answer = sc.nextInt();			
				if(x * y == answer) {
					System.out.println("정답입니다.");
				break;}else {
					System.out.println("오답입니다. 다시 입력하세요");					
			}
		}
	}
}