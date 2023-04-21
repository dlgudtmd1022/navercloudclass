package day03;

public class ShortCicuitExample {

	public static void main(String[] args) {
		/*
		 * &, |은 모든 결과를 확인하고 넘어가기 때문에
		 * 연산 효율이 떨어지므로 일반적인 상황에서는 잘 사용하지 않습니다.
		 */
		
		/* 거짓 & 3/0의 몫은 1이다 라는 명제 (거짓 & ? )
		 * 이미 false가 왼편에 와서 false가 확정이지만, 3/0을 수행해 에러가 발생함
		 */
//		System.out.println(false &  (3 / 0 == 1));
		// &&를 사용하여 왼편이 이미 false로 결과값도 false로 출력
		System.out.println(false && (3 / 0 == 1));
	
		System.out.println(true || (12 < 5));
		System.out.println(false || (12 < 5));
		System.out.println(false && (12 < 5));
		System.out.println(false || (3 == 1));
	
	}

}
