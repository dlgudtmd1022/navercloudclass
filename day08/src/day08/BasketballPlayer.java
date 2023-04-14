package day08;

public class BasketballPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary);
		
	}
	
	public void dunkShoot( ) { //덩크슛하기 기능
		if (height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("골대에 안닿음.");
		}
	}
}
