package inheritance.game;

public class Archer extends Commoner{

	public int aRange;
	
	public void getInfo() {
		System.out.println("현재 상태");
		System.out.println("---------------");
		System.out.println("아이디 : "+ id);
		System.out.println("현재 레벨 : "+ lev);
		System.out.println("현재 체력 : "+ hp);
		System.out.println("현재 마나 : "+ mp);
		System.out.println("공격 사정거리 : "+ aRange);
		System.out.println("---------------");
		
	}
	}
