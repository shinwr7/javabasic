package interaction.game;

public class Warrior {
	private int hp, atk, def, mp, lev, exp;
	
	public Warrior () {
		hp = 150;
		atk=20;
		def=8;	
		mp = 0;
		lev = 1;
		exp = 0;
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

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void huntDragon (Dragon a) {
		if(a.getDef()>=atk) {
			System.out.println("몬스터의 방어력이 너무 높습니다.");
			System.out.println("몬스터가 피해를 입지 않습니다.");
			a.battleWithWarrior(this);
			return;
			}
		if(a.getHp()<=0) {
			System.out.println("드래곤이 이미 사망하였습니다.");
			return;
		}
		if (this.hp<0) {
			System.out.println("플레이어가 행동 불능 상태입니다.");
			return;
		}
		System.out.println("드래곤 사냥을 시작합니다.");
		a.setHp(a.getHp()-(atk-a.getDef()));
		System.out.println("드래곤에게 "+(atk-a.getDef())+"만큼의 피해를 입혔습니다.");
		if (a.getHp()<=0) {
			System.out.println("드래곤이 사망하였습니다.");
			this.exp+=50;
			System.out.println("경험치 50 획득하였습니다.");
			return;
		} 
		System.out.println("드래곤이 반격합니다.");
		a.battleWithWarrior(this);
		
	}
	public void huntUndead (Undead a) {
		if(a.getDef()>=atk) {
			System.out.println("몬스터의 방어력이 너무 높습니다.");
			System.out.println("몬스터가 피해를 입지 않습니다.");
			a.battleWithWarrior(this);
			return;
			}
		if(a.getHp()<=0) {
			System.out.println("언데드가 이미 사망하였습니다.");
			return;
		}
		if (this.hp<=0) {
			System.out.println("플레이어가 행동 불능 상태입니다.");
			return;
		}
		System.out.println("언데드 사냥을 시작합니다.");
		a.setHp(a.getHp()-(atk-a.getDef()));
		System.out.println("언데드에게 "+(atk-a.getDef())+"만큼의 피해를 입혔습니다.");
		if (a.getHp()<=0) {
			System.out.println("언데드가 사망하였습니다.");
			this.exp+=50;
			System.out.println("경험치 50 획득하였습니다.");
			return;
		} 
		System.out.println("언데드가 반격합니다.");
		a.battleWithWarrior(this);
		
	}
	public void huntDarkelf (Darkelf a) {
		if(a.getDef()>=atk) {
			System.out.println("몬스터의 방어력이 너무 높습니다.");
			System.out.println("몬스터가 피해를 입지 않습니다.");
			a.battleWithWarrior(this);
			return;
			}
		if(a.getHp()<=0) {
			System.out.println("다크엘프가 이미 사망하였습니다.");
			return;
		}
		if (this.hp<=0) {
			System.out.println("플레이어가 행동 불능 상태입니다.");
			return;
		}
		System.out.println("다크엘프 사냥을 시작합니다.");
		a.setHp(a.getHp()-(atk-a.getDef()));
		System.out.println("다크엘프에게 "+(atk-a.getDef())+"만큼의 피해를 입혔습니다.");
		if (a.getHp()<=0) {
			System.out.println("다크엘프가 사망하였습니다.");
			this.exp+=50;
			System.out.println("경험치 50 획득하였습니다.");
			return;
		} 
		System.out.println("다크엘프가 반격합니다.");
		a.battleWithWarrior(this);
		
	}
	
	public void getWarriorInfo() {
		System.out.println("-----전사 상태-----");
		System.out.println("레벨 : "+ lev);
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
		System.out.println("경험치 : "+ exp);
		
	}
	
	public void huntZombie (Zombie zombie) {
		if(zombie.getHp()<=0) {
			System.out.println("좀비가 이미 죽어있습니다.");
			return;
		}
		
		if(this.hp<=0) {
			System.out.println("플레이어가 행동 불능입니다.");
			return;
		}
		zombie.battle(this.atk);
		if(zombie.getHp()<=0) {
			System.out.println("좀비가 사망하였습니다.");
			System.out.println("플레이어의 경험치가 50 상승합니다.");
			this.exp+=50;
			return;
		}
		System.out.println("좀비가 공격합니다.");
		System.out.println("좀비의 공격으로 "+(zombie.getAtk()-def)+"만큼 피해를 입습니다.");
		this.hp=hp-(zombie.getAtk()-def);
		if(this.hp<=0) {
			System.out.println("플레이어가 사망하였습니다.");
			return;
		}
	}
	
}

