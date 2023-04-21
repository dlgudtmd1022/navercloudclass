package day03;

public class BitOperatorExample {

	public static void main(String[] args) {
		byte a =5; // 00000101
		byte b= 3; // 00000011

		
		// 비트곱 (and, &) 00000001
		System.out.println(a & b);
		
		// 비트합 (or, |)  00000111
		System.out.println(a | b);
		
		// 배타적 논리합 (xor)  00000110
		System.out.println(a ^ b);
		
		// 비트 이동 연산자 (<<, >>)

		System.out.println(a << 4); // 01010000 2^4 곱하기
		byte c = 48; // 00110000
		System.out.println(c >> 3); // 00000110 2^3 나누기

		
	}

}
