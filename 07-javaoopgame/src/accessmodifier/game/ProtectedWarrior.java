package accessmodifier.game;

public class ProtectedWarrior extends ProtectedCommoner{
	
	public ProtectedWarrior () {
		
		hp=150;
		mp=80;
		lev=1;
		exp=0;
		atk=20;
	}
	
	
	public void doubleatk( ) {
		if(mp-2<0) {
			System.out.println("스킬 사용 불가");
			
		}else {
		
		mp-=2;
		exp+=15;
		System.out.println("-----더블어택 사용-----");
		}
	}
	public void getWarriorStatus() {
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("레벨 : "+ lev);
		System.out.println("경험치 : "+ exp);
		System.out.println("-------------");
	}

	
}
