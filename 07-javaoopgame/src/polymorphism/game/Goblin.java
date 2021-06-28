package polymorphism.game;

public class Goblin extends Monster{
	
	public Goblin () {
		super("고블린", 80, 5, 1);
		
	}
	
	public void battle (Player player) {
		{
			if(getHp()<=0) {
				System.out.println(super.getMonster()+"몬스터가 사망하였습니다.");
				System.out.println("경험치 50 획득");
				player.setExp(player.getExp()+50);
				return;
				}
			super.battle(player);
		}
	}
	
}
