package accessmodifier.game;

public class Monster {
	
	private int hp, atk, def;
	
	public Monster () {
		hp= 20;
		atk=10;
		def=5;
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

	public void hitCommoner(Commoner a) {
		a.setHp(a.getHp()-this.atk);
		if(getHp()<0) {
			System.out.println("Commoner 사망");
			return;
		}
		
	}
		
	public void hitbyCommoner(Commoner a) {
		this.hp=a.getAtk()-def;
		if(hp<0) {
			System.out.println("몬스터 사망");
			return;
		}
	}
	
}
