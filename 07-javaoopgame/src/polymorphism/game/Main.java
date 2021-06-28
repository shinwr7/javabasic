package polymorphism.game;

public class Main {
	public static void main(String[] args) {
		
		Player p1 = new Priest ();
		Monster d1 = new Dragon() ;
		Monster e1 = new DarkElf() ;
		Monster k1 = new Deathknight() ;
		Monster g1 = new Goblin() ;
//		p1.hunt(d1);
//		p1.hunt(d1);
//		p1.hunt(d1);
//		p1.getPlayerInfo();
//		d1.getMonsterInfo();
//		
//		
//		p1.holyCross(d1);
//		p1.holyCross(d1);
//		p1.holyCross(d1);
//		p1.holyCross(d1);
//		p1.getPlayerInfo();
//		d1.getMonsterInfo();
		p1.holyCross(k1);
		k1.getMonsterInfo();
		p1.holyCross(k1);
		k1.getMonsterInfo();
		p1.holyCross(k1);
		k1.getMonsterInfo();
		p1.getPlayerInfo();
		p1.holyCross(g1);
		g1.getMonsterInfo();
		p1.getPlayerInfo();
		p1.holyCross(g1);
		g1.getMonsterInfo();
		p1.getPlayerInfo();
		p1.holyCross(g1);
		g1.getMonsterInfo();
		p1.getPlayerInfo();
		
}		
	}
