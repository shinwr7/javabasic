package accessmodifier.game;

public class Warrior extends Commoner{
	
	
		
	
	public Warrior () {
		System.out.println("-----전사 생성-----");
		setHp(getHp()+100);
		setMp(getMp()-10);
		setAtk(getAtk()+10);
		
		
	}
	public void doubleAttack () {
		if(getHp()-10<0||getMp()-10<0) {
			System.out.println("스킬 사용 불가");
		}else {
		System.out.println("전사 더블어택 사용");
		setHp(getHp()-20);
		setMp(getMp()-10);
		setExp(getExp()+15);
		
		
		
		}
		{
		}
	}
}

