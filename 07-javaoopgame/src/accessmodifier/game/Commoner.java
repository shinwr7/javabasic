package accessmodifier.game;

public class Commoner {
	private int hp;
	private int mp;
	private int atk;
	private int lev;
	private int exp;
	private int def;
	
		
	
	public Commoner () {
		this.hp=100;
		this.mp=50;
		this.atk=10;
		this.lev=1;
		this.exp=0;
		this.def=5;
	
		
			}
	
	public void training () {
		
		
		if(this.hp-10<0) {
			System.out.println("훈련 실패");
		}else {
		this.hp-=10;
		this.exp+=10;
		System.out.println("훈련 완료");
		levUp();
	}}
	
	
	public void levUp() {
		if(this.exp>=100) {
			this.lev+=1;
			System.out.println("레벨이 1 상승하였습니다.");
			System.out.println("현재 레벨 : "+ this.lev);
			this.exp=0;
			}
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
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void getAllInfo() {
		System.out.println("------현재 상태------");
		System.out.println("현재 레벨 :" + this.lev);
		System.out.println("현재 체력 : "+this.hp);
		System.out.println("현재 마나 :" +this.mp);
		System.out.println("현재 데미지 :" + this.atk);
		System.out.println("현재 경험치 :" +this.exp);
	}
	public void rest() {
		this.hp+=50;
		this.mp+=50;
	}
	public void hitMonster(Monster a) {
		a.setHp(a.getHp()+a.getDef()-atk);
		if (a.getHp()<0) {
			System.out.println("몬스터 사망");
			return;
		}
		
		
	}
}
