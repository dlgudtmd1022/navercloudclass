package poly.inheri;

public class Main {
public static void main(String[] args) {
	 // 워리어 1 생성 후 , 쥐랑도, 토끼랑도 교전 
	 Rabbit r1 = new Rabbit();
	 Rat rat1 = new Rat();
	 
	 Warrior w1 = new Warrior("헌터");
	 
//	 w1.showStatus();
//	 w1.hunt(r1);
//	 w1.hunt(r1);
//	 w1.hunt(r1);
//	 w1.showStatus();
//	 
//	 w1.hunt(rat1);
//	 w1.hunt(rat1);
//	 w1.hunt(rat1);
//	 w1.hunt(rat1);
//	 w1.showStatus();

	 DoKaeBi b1 = new DoKaeBi();
	 
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.hunt(b1);
	 w1.showStatus();
	 
	 
	
	 
}
}
