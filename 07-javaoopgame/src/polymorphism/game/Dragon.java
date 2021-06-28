package polymorphism.game;

public class Dragon extends Monster {
	
	public Dragon () {
		super("드래곤",80 ,7,6);
	
	}
	
	public void battle (Player player) {
		{
			if(getHp()<=0) {
				System.out.println(super.getMonster()+"몬스터가 사망하였습니다.");
				System.out.println("경험치 100 획득");
				player.setExp(player.getExp()+100);
				return;
				}
			super.battle(player);
			
	}
	}
	
	
	
}
