package day06;

public class ForStarQuiz3_2 {
	//     *
	//    **
	//   ***
	//  ****
	// *****
	   	
	public static void main(String[] args) {
		// 중첩 만복문을 쓰되, if문으로 " " 와 "*"을 통제
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <=5; j++) {
				if(i <= 5-j) { // i의 값은 고정이고 5-j로 1부터 5까지 돌렸을때, 첫텀에 4개가 true가 나오게 설계
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			} 	System.out.println();
		}
	}
}
