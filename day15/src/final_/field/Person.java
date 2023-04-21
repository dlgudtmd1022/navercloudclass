package final_.field;

public class Person {

	/*
	 * 
	 */
	
	 public final String nationality = "대한민국";// 1. 선언부 초기화
	 public final String name;// 여기서 초기화 안 하면 2. 무조건 생성자 초기화
	 public int age;// final이 안 붙은 맴버변수는 초기화 의무 x
	 
	 public Person(String name) {
		 this.name = name;
	 }
}
