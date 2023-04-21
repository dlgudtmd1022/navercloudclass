package poly.noinheri;

public class Pig {
	
	private int hp;
	private int atk;
	private int def;
	
	public Pig() {
		this.hp = 7;
		this.atk = 2;
		this.def = 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isPigActive() {
		return hp > 0 ? true : false;
	}
	
	public boolean isAttakedPigActive(int atk) {
		return (hp - atk) > 0 ? true : false;
	}
	
	public void setDamageHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
}
