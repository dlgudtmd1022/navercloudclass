package day08;

public class Cat {
	public String name;
	public int age;
	public String kind;
	public String color;
	
	public Cat(String n, int a, String k, String c) {
		// 좌측 파란색이 맴버변수, 우측 회색이 지역변수
		name = n;
		age = a;
		kind = k;
		color = c;
		
	} 

	// 설계 클래스 내부에 선언하는 메서드는 static를 쓰지 않습니다.
 	public void showCatInfo() {
 		System.out.println(name);
 		System.out.println(age);
 		System.out.println(kind);
 		System.out.println(color);
 	}
	
}
