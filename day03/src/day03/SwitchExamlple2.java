package day03;

import java.util.Scanner;

public class SwitchExamlple2 {
	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		
		Scanner scan = new Scanner(System.in);
		
		String[] foods = {"맥주", "잔치국수", "와플", "삼겹살", "감자튀김"};
		
		// 0 ~ 4 범위 난수를 얻도록 해 주세요
		int idx = ((int)(Math.random() * 5));
		
		System.out.println(foods[idx]);
		switch(foods[idx]) {
		// 여러분들이 최애 3개 요리는 case에서 체크해서
		// "XX식입니다"라고 출력하게 해 주시고
		// 나머지 2개가 걸린 경우에는 default문을 이용해 "기타요리입니다"라고 출력해주세요.
		

		
		
		     case "맥주" :
				System.out.println("주류입니다!");
				break;
			case "와플" :
				System.out.println("디저트입니다!");
				break;
			case "삼겹살" :
				System.out.println("한식입니다!");
				break;
			default :
				System.out.println("기타음식입니다.");
		}
	}
}
