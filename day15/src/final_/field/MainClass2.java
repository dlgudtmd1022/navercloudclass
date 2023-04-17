package final_.field;

import java.util.Arrays;

public class MainClass2 {

	// 참조형 변수를 가진 배열의 경우 변수자체의 주소는 final이지만
	// 참조형 변수의 내부자료까지 바뀌지 않음을 보장하지 않습니다.
	public static void main(String[] args) {
		Collector c1 = new Collector();
		
		System.out.println(Arrays.toString(c1.stickers));
		
		c1.stickers[0] = "파이리";
		
		System.out.print(Arrays.toString(c1.stickers));
	}
}
