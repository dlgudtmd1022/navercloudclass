package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {
		
		Pig p1 = new Pig();				
//		Warrior w1 = new Warrior("돼지 사냥꾼");
//				
//		w1.showStatus();
//		w1.huntPig(p1);
//		w1.huntPig(p1);
//		w1.huntPig(p1);
//		w1.huntPig(p1);
//		w1.huntPig(p1);
//		w1.showStatus();
		
//		Ghost g1 = new Ghost();		
//		Warrior w2 = new Warrior("유령 사냥꾼");
//		
//		System.out.println("____________________");
//		w2.showStatus();
//		w2.huntGhost(g1);
//		w2.showStatus();
//		w2.huntGhost(g1);
//		w2.showStatus();
//		w2.huntGhost(g1);
//		w2.huntGhost(g1);
		
		Magician m1 = new Magician("매지션");
		
		m1.showStatus();
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.showStatus();
				
	}
}
