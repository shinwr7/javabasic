package accessmodifier.game;

public class Main {
	public static void main(String[] args) {
		Warrior w1 = new Warrior ();
		w1.doubleAttack();
		w1.getAllInfo();
		
		Magician m1 = new Magician();
		m1.training();
		m1.getAllInfo();
		
	
		Priest p1 = new Priest();
		p1.HolyLight();
		p1.HolyLight();
		p1.HolyLight();
		p1.training();
		p1.training();
		p1.training();
		p1.training();
		p1.training();
		p1.training();
		p1.getAllInfo();
		
		
		Elf e1 = new Elf();
		e1.starFall();
		e1.chainLightening();
		e1.getAllInfo();
	}
	
}
