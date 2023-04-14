package poly.instanceof_;

public class MainCalss2 {

	public static void main(String[] args) {
		// Human, Student, Cat 인스턴스를 생성해보겠습니다.
		Human h1 = new Human("이형승",25);
		h1.showInfo();
	
		Student s1 = new Student("머학생", 23);
		s1.showInfo();
		
		Cat c1 = new Cat("까미", 1);
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Human);
		// 관련이 아예 없는 객체간 비교는 에러발생
//		System.out.println(c1 instanceof Human);
		System.out.println(h1 instanceof Student); // Human이 부모클래스이고 Student가 자식클래스이기 떄문에 false로 출력
		System.out.println(s1 instanceof Student);
//		System.out.println(c1 instanceof Student);
	}
}
