package interaction.game;

public class Main {
	public static void main(String[] args) {
		//영웅
		Warrior w = new Warrior() ;
		Priest p = new Priest() ;
		Amazon z = new Amazon() ;
		
		//몬스터
		Dragon a = new Dragon() ;
		Darkelf e = new Darkelf() ;
		Undead u = new Undead () ;
		Zombie z2 = new Zombie () ;
		
//		w.huntZombie(z2);
//		w.huntZombie(z2);
//		w.getWarriorInfo();
//		z2.getZombieInfo();
	
		
		p.huntZombie(z2);
		p.huntZombie(z2);
		p.getPriestInfo();
		z2.getZombieInfo();
	
	}
}
