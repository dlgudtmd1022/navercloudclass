package poly.instanceof_;

public class MainClass1 {

	public static void main(String[] args) {
		
		Human h1 = new Human("또자", 20);
		Human h2 = new Human();
		Student s1 = new Student("이형승", 25);
		
		
		h1.showInfo();
		h2.showInfo();
		s1.showInfo();
		
		}
	
}
