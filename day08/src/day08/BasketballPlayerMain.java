package day08;

public class BasketballPlayerMain {
	public static void main(String[] args) {
	
		BasketballPlayer b1 = new BasketballPlayer();
		BasketballPlayer b2 = new BasketballPlayer();
		
		//b1 = 아래 변수들이 저장된 주소
		b1.name = "조던";
		b1.height = 198;
		b1.age = 51;
		b1.salary = 65000000;

		
		//b2 = 아래 변수들이 저장된 주소
		b2.name = "커리";
		b2.height = 188;
		b2.age = 36;
		b2.salary = 52000000;
		
		b1.showInfo();
		b1.dunkShoot();
		System.out.println("-------------");
		b2.showInfo();	
		b2.dunkShoot();
	
	}
}
