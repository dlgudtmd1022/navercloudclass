package day05;

public class NestedForExamlple {
	public static void main(String[] args) {
			
		for(int i = 1; i < 6; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("*"); //println가 아닌 print합니다.
			}// 내부 for문(j)
				System.out.println(); //줄 바꿈만 수행함
			}//외부 for문(i)
	}
}	
