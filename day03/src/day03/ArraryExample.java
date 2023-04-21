package day03;

import java.util.Arrays;

public class ArraryExample {

	public static void main(String[] args) {
		// 배열의 선언 - stack에 배열 주소를 담을 변수 생성
		int[] score; // int score[]; 도 가능 score - 저장된 장소의 주소를 알고있음
		
		// 배열의 생성 - heap에 실제 데이터가 저장될 공간을 생성
		// 배열은 생성 시 크기를 명시함. 한 번 크기 세팅 시 조정 불가
		score = new int[5]; // int 5개를 담을 수 잇는 크리고 score 생성
		System.out.println(score); // 실제로 주소를 담고있으므로, 주소가 나온다		
		
		// 배열의 초기화 - 배열 내부에 값을 직접 저장하기 
		// 사람은 순서를 1부터 세지만, 프로그래밍에서는 대부분 0부터 셉니다.
		score[0] = 12;
		score[1] = 67;
		score[4] = 55;
		
		// 배열 값의 참조 (조회)
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
	
		/*
		 * 배열 내부에 저장된 값들을 한눈에 문자열 형태로
		 * 확인하기위해서는 Arrays.toString(배열변수);를 사용합니다
		 */
		System.out.println(Arrays.toString(score));
		
		//배열의 길이를 알아보려면 변수명.length를 사용합니다.
		System.out.println(score.length);
		
		// 배열의 선언과 생성을 동시에 하는 방법
		int[] iArr = new int [7]; //위에서는 선언과 생성을 두 줄에 걸쳐서 진행함
		
		// 배열의 선어노가 초기화를 동싱에 하는 방법 : {}
		int[] iArr2 = {1, 3, 5, 7, 9}; // 중괄호에 넣을 자료를 나열해 대입
		
		System.out.println(Arrays.toString(iArr2));
		
		
		

	}
}
