package day06;

public class ContinueExample1 {
	public static void main(String[] args) {
		 // 짝수만 출력하는 continue 예시
		for (int i = 1; i < 11; i++) {
			if(i %2 != 0 ) 
				// 해당 바퀴를 스킵하고 시작지점으로 이동
				continue;
			System.out.print(i + " ");
		}
	}
}
