package accessmodifier.game;

public class Priest extends Commoner{
	public Priest() {
		System.out.println("-----사제 생성-----");
		setHp(getHp()-50);
		setMp(getMp()+100);
		
	}
	public void HolyLight() {
		if(getMp()-50<0) {
			System.out.println("마나 부족");
		}else {
			System.out.println("성스러운 빛 시전");
			setHp(getHp()+30);
			setMp(getMp()-50);
			setExp(getExp()+15);
			levUp();
			
		}
	}
	
}
