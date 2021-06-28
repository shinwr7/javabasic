package polymorphism.game;

public class Monster {
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
	
	public void battle(Player player) {
		
	
		System.out.println(monster+"(이)가 반격합니다.");
		if(getAtk()<=player.getDef()) {
			System.out.println(player.getPlayer()+"의 방어력이 높습니다.");
			System.out.println(getMonster()+"몬스터가 피해를 입힐 수 없습니다.");
			return;
		}
		player.setHp(player.getHp()-(getAtk()-player.getDef()));
		System.out.println(monster+"(이)가"+ player.getPlayer()+"에게"+(getAtk()-player.getDef())+"만큼의 피해를 입힙니다.");
	}
	public void getMonsterInfo() {
	System.out.println("-----"+monster+"상태-----");
	System.out.println("체력 : "+ getHp());
	System.out.println("공격력: "+getAtk());
	System.out.println("방어 : "+ getDef());
}
}