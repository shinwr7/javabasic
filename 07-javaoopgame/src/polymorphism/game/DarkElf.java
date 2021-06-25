package polymorphism.game;

public class DarkElf extends Monster{
	private int hp, atk, def;
	
	public DarkElf() {
		
		this.hp = 80;
		this.atk = 9;
		this.def = 6;
		
	}
	
	public void getMonsterInfo(DarkElf e) {
		getMonsterInfo(this);
	}
	
	public void battle (Player p) {
		super.battle(p);
	}
	
	
}
