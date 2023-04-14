package day03r;

public class Threer {
	public static void main(String[] args) {
		
		int fire = ((int)(Math.random()* 10));
		
		String result = (fire > 5 ? "긴급" : "괜찮");
		
		System.out.println(fire);
		System.out.println(result);
	}
}
