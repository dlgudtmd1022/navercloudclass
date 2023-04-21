package example.override;

public class OverridExample {
	public static void main(String[] args) {
			
	// 학색 클래스의 인스턴스를 생성해주세요.
		Student s1 = new Student();

		s1.name = "김자바";
		s1.age = 21;
		s1.major = "컴공";
				
		s1.자기소개하기();
		
}
}