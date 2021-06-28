package polymorphism.game;

public class DarkElf extends Monster{
	
	public DarkElf() {
		super("다크엘프",70 ,6,4);
		
	}
	
	
	public void battle (Player player) {
		{
			super.battle(player);
			
			if(getHp()<=0) {
				System.out.println(super.getMonster()+"몬스터가 사망하였습니다.");
				System.out.println("경험치 80 획득");
				player.setExp(player.getExp()+80);
				return;
			}
	}
	}}
	

