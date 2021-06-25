package buyandsell;

public class OrangeSeller {
	
	private int money, orange;
	
	public OrangeSeller (int orange) {
		this.orange=orange;
	}
	
	public void sellOrange(int orange) {
		if(this.orange<orange) {
			System.out.println("재고부족");
			return;	
		}
		this.money+=orange*1000;
		this.orange-=orange;
	}
	
	public void showOrangeSeller () {
		System.out.println("-----오렌지상인-----");
		System.out.println("소지 금액 : "+ money);
		System.out.println("소지 오렌지 : "+ orange);
	}
	
	public int getOrange() {
		return orange;
	}
}
