package accessmodifier.game;

public class ProtectedCommoner {
	protected int hp;
	protected int mp;
	protected int lev;
	protected int exp;
	protected int atk;
	

	public ProtectedCommoner() {
		hp= 100;
		mp=50;
		lev=1;
		exp=0;
		atk=10;
				


	}
	public void hunt () {
		if(hp-2<0) {
			System.out.println("체력 부족");
		}else {
		hp -=2;
		exp +=10;
		System.out.println("-----사냥 시작-----");
		}}
		
public void getAllData() {
	System.out.println("현재 레벨 :"+ lev );
	System.out.println("현재 체력 :"+ hp );
	System.out.println("현재 마나 :"+ mp );
	System.out.println("현재 공격력 :"+ atk );
	System.out.println("현재 경험치 :"+ exp );
	System.out.println("-------------");
}



}



	

