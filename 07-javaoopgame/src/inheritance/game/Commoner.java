package inheritance.game;

public class Commoner {
	// 레벨 , 체력, 아이디, 마나수치를 변수로 만들어주세요. 
	
	// 메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록 
	// 구성해주시면 됩니다. 
	
	public int lev ;
	public int hp ;
	public String id;
	public int mp;
	
	public void getInfo() {
		System.out.println("현재 상태");
		System.out.println("아이디 : "+ id);
		System.out.println("현재 레벨 : "+ lev);
		System.out.println("현재 체력 : "+ hp);
		System.out.println("현재 마나 : "+ mp);
		
	}
	
}
