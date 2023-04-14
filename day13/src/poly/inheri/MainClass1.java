package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		
	
	Rabbit r1 = new Rabbit();
	Rat m1 = new Rat();
	Warrior w1 = new Warrior("사냥꾼");
	
	w1.showStatus();
	w1.hunt(r1);
	w1.showStatus();
	w1.hunt(r1);
	w1.showStatus();
	w1.hunt(r1);
	}
}