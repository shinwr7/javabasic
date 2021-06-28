package polymorphism.game;

public class Player {
	private int hp, mp, def, atk, lev, exp;
	private String player;

	public Player (String player, int hp, int mp, int atk, int def, int lev, int exp) {
		this.hp=hp;
		this.mp=mp;
		this.def=def;
		this.atk=atk;
		this.lev=lev;
		this.exp=exp;
		this.player=player;
}
	
	

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public void hunt (Monster monster) {
		if(monster.getDef()>=atk) {
			System.out.println(monster.getMonster()+"몬스터의 방어력이 높습니다.");
			System.out.println(monster.getMonster()+"몬스터에게 피해를 입힐 수 없습니다.");
			monster.battle(this);
			return;
		}
		if(monster.getHp()<=0) {
			System.out.println(monster.getMonster()+"몬스터가 이미 죽어있습니다.");
			return;
		}
		if(getHp()<=0) {
			System.out.println("플레이어가 행동 불능입니다.");
			return;
		}
		System.out.println(monster.getMonster()+"몬스터에게 공격을 가합니다!");
		monster.setHp(monster.getHp()-(getAtk()-monster.getDef()));
		System.out.println(monster.getMonster()+"몬스터에게"+(getAtk()-monster.getDef())+"만큼의 피해를 입혔습니다.");
		monster.battle(this);
		
		
		if(getHp()<=0) {
			System.out.println("플레이어 사망");
			return;
		}
		
		
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}
	public void getPlayerInfo() {
		System.out.println("------플레이어 상태-----");
		System.out.println("레벨 : "+ getLev());
		System.out.println("체력 : "+ getHp());
		System.out.println("마나 : "+ getMp());
		System.out.println("방어 : "+ getDef());
		System.out.println("경험치 : "+ getExp());
		System.out.println("공격력: "+ getAtk());
	}
	
	public void holyCross(Monster monster) {
		
	}
}
