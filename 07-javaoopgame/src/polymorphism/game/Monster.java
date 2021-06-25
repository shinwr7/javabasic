package polymorphism.game;

public class Monster {
	private int hp, atk, def;
	
	public Monster () {
		hp = 50;
		atk = 3;
		def = 2;
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
	
		if(this.hp<=0) {
			System.out.println("몬스터가 사망하였습니다.");
			System.out.println("경험치 50 획득");
			player.setExp(player.getExp()+50);
			return;
		}
		System.out.println("몬스터가 반격합니다.");
		player.setHp(player.getHp()-(this.atk-player.getDef()));
		System.out.println("몬스터가 플레이어에게"+(this.atk-player.getDef())+"만큼의 피해를 입힙니다.");
	}
	public void getMonsterInfo(Monster m) {
	System.out.println("------몬스터 상태-----");
	System.out.println("체력 : "+ m.getHp());
	System.out.println("방어 : "+ m.getDef());
	System.out.println("공격력: "+ m.getAtk());
}
}