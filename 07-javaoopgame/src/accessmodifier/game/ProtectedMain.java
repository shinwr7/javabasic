package accessmodifier.game;

public class ProtectedMain {
	public static void main(String[] args) {
		
		ProtectedWarrior w1 = new ProtectedWarrior ();
		
		//w1.getWarriorStatus();
		
		ProtectedMagician m1 = new ProtectedMagician() ;
		
		m1.hunt();
		m1.hunt();
		m1.Fireball();
		m1.getMagicianStatus();
	}
}
