package accessmodifier.game;

public class ProtectedMagician extends ProtectedCommoner{
	public ProtectedMagician () {
		
		mp=300;
		exp=0;
		lev=1;
		
		
	}
	
	public void Fireball () {
		System.out.println("파이어볼 시전");
		mp-=10;
		exp+=20;
	}
	
	public void getMagicianStatus () { 
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("레벨 : "+ lev);
		System.out.println("경험치 : "+ exp);
		System.out.println("-------------");
	}
}
