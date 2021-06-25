package accessmodifier.game;

public class Magician extends Commoner{
	
	public Magician () {
		System.out.println("-----마법사 생성-----");
		setHp(getHp()-30);
		setMp(getMp()+100);
		setAtk(getAtk()-5);
		
	}
	
	public void Fireball () {
		if(getMp()-20<0) {
			System.out.println("마나 부족");
		}
		else {
			System.out.println("파이어볼 시전");
			setMp(getMp()-20);
			setExp(getExp()+15);
			levUp();
			
		}
	}
	
}
