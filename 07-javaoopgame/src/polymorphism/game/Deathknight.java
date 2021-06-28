package polymorphism.game;

public class Deathknight extends Monster{

	public Deathknight () {
		super("데스나이트", 150, 10, 8);

	}

	public void battle (Player player) {
		{
			if(getHp()<=0) {
				System.out.println(super.getMonster()+"몬스터가 사망하였습니다.");
				System.out.println("경험치 150 획득");
				player.setExp(player.getExp()+150);
				return;
				}
			super.battle(player);
		}
	}

}
