package day06;

public class NestedForQuizXY {
	public static void main(String[] args) {
		// 4x + 5y =60의 양수 해를 모두 구하시오.
		
		for(int x = 1; x < 15; x++) {
			for(int y =1; y < 12; y++) {
				// 조건식을 이용해 방정식의 해가 구해진 겨웅만 출력
				if((4 * x) + (5 * y) == 60) 
					System.out.println("x : " + x + " , y : " + y);				
			}
		}
	}
}
