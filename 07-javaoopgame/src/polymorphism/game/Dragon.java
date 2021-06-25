package polymorphism.game;

public class Dragon extends Monster {
	private int hp, atk, def;
	
	
	public Dragon () {
		
		hp = 50;
		atk = 8;
		def = 2;
		
		
	}
	
	public void battle (Player p) {
		super.battle(p);
	}
	
	public void getMonsterInfo(Dragon d) {
		getMonsterInfo(this);
	}
	
}
