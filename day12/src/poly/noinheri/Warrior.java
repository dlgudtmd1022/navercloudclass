package poly.noinheri;

public class Warrior {

	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	// 생성자를 만들어주세요. id만 입력받고
	// 나머지는 체력은 20, 공격력3, 방어력 1, 경험치는 0으로 고정됩니다.
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;		
	}
	
	// 캐릭터 상태가 조회 가능한 showStatus()를 만들어보겠습니다.
	// 이 메서드는 맴버변수정보를 콘솔에 찍어줍니다.
	public void showStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
		System.out.println("방어력 : " + def);
		System.out.println("경험치 : " + exp);
		System.out.println("-----------------------");
	}
	
	
	
	// 단독적으로 사냥을 하도록 메서드를 만들어줍니다.
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 공격 불가");
				return;
		}
		// 1. 내가 공격한 rabbit의 체력을 3 깎습니다.
		rabbit.setHp(rabbit.getHp() - this.atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		}else {
			System.out.println("토끼를 공격했습니다.");
		}
	}
	// huntRat을 개선해서, Rat 객체를 지정해 공격하도록 해 주세요.
	public void huntRat(Rat rat) {
		// 죽었는지 안죽었는지 검사	
		// 안죽었다면 죽을지 먼저 검사
		if(!rat.isRatActive()) {
			System.out.println("이미 죽어서 공격 불가");
				return;
		}		
		if(!rat.isAttackedRatActive(atk)) {	
			rat.setDamagedHp(atk);
			System.out.println("쥐를 잡았습니다.");
			this.exp += 80;
		}else {
			System.out.println("쥐가 공격했습니다.");
			this.hp -= rat.getAtk();
			rat.setDamagedHp(atk);
		}
		// 내 공격을 받고 Rat이 죽었다면 경험치 올리고 반격 안받음	
		// 공격 받고도 안죽으면 나도 반격당해서 rat.atk만큼 체력 차감
	}
	
	public void huntPig(Pig pig) {
		if(!pig.isPigActive()) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		
		if(!pig.isAttakedPigActive(atk)) {
			pig.setDamageHp(atk);
			System.out.println("돼지를 잡았다");
			this.exp += 100;
		}else {
			System.out.println("못잡아서 나도 한 대 맞음");
			this.hp -= pig.getAtk();
			pig.setDamageHp(atk);
		}		
	}
	
	public void huntGhost(Ghost ghost) {
		if(ghost.getHp() <= 0 ) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		ghost.setHp(ghost.getHp()- (this.atk - ghost.getDef()));
		if(ghost.getHp() <= 0) {
			System.out.println("귀신 잡았다");
			this.exp += 1;
		}else {
			System.out.println("귀신한테 반격당했다");
			this.hp -= ghost.getAtk();
		}		
	}
}
