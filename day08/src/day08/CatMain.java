package day08;

public class CatMain {
	public static void main(String[] args) {
		
		Cat c1 = new Cat("또자", 10, "짧은털냥이", "회색");
		Cat c2 = new Cat("구름이", 6, "긴털냥이", "흰색");
		
		c1.showCatInfo();
		System.out.println("-------------------");
		c2.showCatInfo();
	
	}
}
