package inheritance;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name = "김학생";
		st1.age = 22;
		st1.major = "컴공";
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "직장인";
		sm1.age = 44;
		sm1.salary = 1;
		
		Player py1 = new Player();
		
		py1.name = "비트";
		py1.age = 30;		
		py1.sports = "농구";
		py1.height = 200;
		
		
	}
}

