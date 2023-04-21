package day05;

import java.util.Scanner;

public class ForStarQuiz1 {
	// *
	// **
	// ***
	// ****
	// *****
	
	/* 
	중첩 반복문을 사용하셔야 합니다.
	바깥족 반복문은 세로 길이를 나타냅니다.
   	안쪽 반복문은 별의 개수인데 점점 늘어나는 변수를 이용해 (반복문에 점점 증가하는 요소가 있음)
   	줄이 바뀔떄마다 별 개수가 늘어나게 처리해주세요.
	 */
	
	//추가 요구사항 : 사용자 스캐너로 층수를 입력바게 고쳐주세요
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
					
		int u = scan.nextInt();
		scan.close();
		 for (int i = 1; i <= u; i++) {
		 for (int j = 1; j <= i; j++) {
			System.out.print("*");
		 }
			System.out.println();
		}
	}
}