package inheritance.game;

public class Main3 {

	public static void main(String[] args) {
		
		Archer a1=new Archer();
		
		a1.id="궁수임";
		a1.lev=5;
		a1.hp=120;
		a1.mp=60;
		a1.aRange=150;
		
		a1.getInfo();
		
		Magician m1 = new Magician();
		
		m1.id="법사임";
		m1.lev=8;
		m1.hp=110;
		m1.mp=500;
		m1.mDamage=15;
		
		m1.getInfo();
		
		
	}

}
