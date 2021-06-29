package polymorphism.game;

public class DarkElf extends Monster{
	
	public DarkElf() {
		super("다크엘프",70 ,6,4);
		
	}
	
	
	public void battle (Player player) {
		{
			if(getHp()<=0) {
				System.out.println(super.getMonster()+"몬스터가 사망하였습니다.");
				System.out.println("경험치 50 획득");
				player.setExp(player.getExp()+50);
				return;
			}
				System.out.println(super.getMonster()+"(이)가 반격합니다.");
				if(getAtk()<=player.getDef()) {
					System.out.println(player.getPlayer()+"의 방어력이 높습니다.");
					System.out.println(getMonster()+"몬스터가 피해를 입힐 수 없습니다.");
					return;
				}
				player.setHp(player.getHp()-(getAtk()-player.getDef()));
				System.out.println(super.getMonster()+"(이)가"+ player.getPlayer()+"에게"+(getAtk()-player.getDef())+"만큼의 피해를 입힙니다.");
				}
			
		}
	}
	

