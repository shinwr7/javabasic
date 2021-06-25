package interaction.game;

public class Undead {
private int hp, def, atk;
	
	
	public Undead () {
		hp = 60;
		def = 2;
		atk = 3;
		
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

	public void battleWithWarrior (Warrior w) {
		if(w.getDef()>=atk) {
			System.out.println("플레이어의 방어력이 높습니다.");
			System.out.println("몬스터가 피해를 입히지 못합니다.");
			return;
			}
		
		w.setHp(w.getHp()-(atk-def));
		System.out.println("언데드가 "+(atk-def)+"만큼의 피해를 입혔습니다.");
		
		
		
		if(w.getHp()<=0) {
			System.out.println("언데드가 전사를 살해");
			return;
		}
		
	}
	public void getUndeadInfo() {
		System.out.println("-----언데드 상태-----");
		System.out.println("체력 : "+ hp);
		System.out.println("방어력 : "+ def);
		System.out.println("공격력 : "+ atk);
	}
	public void battlewithPriest (Priest p) {
		if(p.getDef()>=atk) {
			System.out.println("플레이어의 방어력이 높습니다.");
			System.out.println("몬스터가 피해를 입히지 못합니다.");
			return;
			}
		
		p.setHp(p.getHp()-(atk-def));
		System.out.println("언데드가 "+(atk-def)+"만큼의 피해를 입혔습니다.");
		
		
		
		if(p.getHp()<=0) {
			System.out.println("언데드가 성직자를 살해");
			return;
	}}
public void battleWithAmazon (Amazon z) {
	if(z.getDef()>=atk) {
		System.out.println("플레이어의 방어력이 높습니다.");
		System.out.println("몬스터가 피해를 입히지 못합니다.");
		return;
		}
		
		z.setHp(z.getHp()-(atk-def));
		System.out.println("언데드가 "+(atk-def)+"만큼의 피해를 입혔습니다.");
		
		
		
		if(z.getHp()<=0) {
			System.out.println("언데드가 아마존을 살해");
			return;
		}
}
}

