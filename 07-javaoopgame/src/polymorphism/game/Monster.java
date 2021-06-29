package polymorphism.game;

public abstract class Monster {
	private int hp, atk, def;
	private String monster;
	public Monster (String monster,int hp,int atk,int def) {
		this.hp=hp;
		this.atk=atk;
		this.def=def;
		this.monster=monster;
	}

	public String getMonster() {
		return monster;
	}

	public void setMonster(String monster) {
		this.monster = monster;
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
	
	public abstract void battle(Player player);
	
	public void getMonsterInfo() {
	System.out.println("-----"+monster+"상태-----");
	System.out.println("체력 : "+ getHp());
	System.out.println("공격력: "+getAtk());
	System.out.println("방어 : "+ getDef());
}
}