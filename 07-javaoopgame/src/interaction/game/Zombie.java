package interaction.game;

public class Zombie {
	private int hp, atk, def;
	
	public Zombie () {
		hp = 15;
		atk = 5; 
		def = 1 ;
				
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


	public void battle (int uatk) { }
//		if(uatk<=this.def) {
//			System.out.println("좀비의 방어력이 높습니다.");
//			System.out.println("좀비가 피해를 입지 않습니다.");
//			return;
//		}
//			System.out.println("플레이어가 좀비를 공격합니다.");
//			System.out.println("좀비가"+(uatk-def)+"만큼 피해를 입습니다.");
//			this.hp=(hp+def)-uatk;
//			}
//		
//		
	public void getZombieInfo() {
		System.out.println("-----좀비 상태-----");
		System.out.println("체력 : "+ hp);
		System.out.println("방어력 : "+ def);
		System.out.println("공격력 : "+ atk);
	}
	}
	



