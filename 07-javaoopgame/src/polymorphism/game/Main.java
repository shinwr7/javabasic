package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		
		Player p1 = new Player ();
		Monster d1 = new Dragon() ;
		Monster e1 = new DarkElf() ;
		
//		p1.hunt(d1);
//		p1.hunt(d1);
//		p1.hunt(d1);
//		p1.getPlayerInfo();
//		d1.getMonsterInfo();
//		
		p1.hunt(e1);
		p1.hunt(e1);
		p1.hunt(e1);
		p1.getPlayerInfo();
		e1.getMonsterInfo(e1);
	}
}
