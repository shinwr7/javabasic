package polymorphism.game;

public class Priest extends Player{
	
	public Priest() {
		super("성직자",100, 100, 10, 2, 1, 0);
		
				
	}
	


	public void holyCross(Monster monster) {
		
		if(super.getHp()<=0) {
			System.out.println("플레이어가 행동 불능입니다.");
			return;
		}
		if(super.getMp()<=0) {
			System.out.println("마나 부족");
			return;
		}
		if(monster.getHp()<=0) {
			System.out.println(monster.getMonster()+"(이)가 이미 죽어있습니다.");
			return;
		}
		System.out.println("성직자가 홀리 크로스를 시전합니다.");
		super.setHp(super.getHp()+10);
		super.setMp(super.getMp()-10);
		System.out.println("성직자의 마나가 10만큼 소모되고 체력이 10 상승합니다.");
		monster.setHp(monster.getHp()-50);
		System.out.println(monster.getMonster()+"에게 50만큼의 피해를 입힙니다.");
		monster.battle(this);
		if(getHp()<=0) {
			System.out.println("플레이어 사망");
			return;
		}
		
	}
	
	


	

	

}
