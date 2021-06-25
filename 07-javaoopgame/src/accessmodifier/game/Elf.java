package accessmodifier.game;

public class Elf extends Commoner{
	
	public Elf () {
		setHp(getHp()+40);
		setMp(getMp()+200);
		System.out.println("-----엘프 생성-----");
		
	}
	
	public void starFall() {
		System.out.println("스타폴 시전");
		if(getMp()-30<0) {
			System.out.println("마나 부족");
		}else {
		setMp(getMp()-30);
		setExp(getExp()+20);
		levUp();
		}
	}
	
	public void chainLightening() {
		System.out.println("체인 라이트닝 시전");
		if(getMp()-30<0) {
			System.out.println("마나 부족");
		}else {
		setMp(getMp()-30);
		setExp(getExp()+20);
		levUp();
		}
	}
	
}
