 package example.override;

public class Human {

	public String name;
	public int age;
	
	// 생성자
//	public Human(String n, int a) {
//		name = n;
//		age = a;
//	}
	
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
