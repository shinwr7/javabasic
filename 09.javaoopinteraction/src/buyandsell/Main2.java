package buyandsell;

public class Main2 {
	public static void main(String[] args) {
		
		// 상인 2명 만들기
		// 구매자 1명 만들기
		// 구매자 정보 확인
		// 1번상인 정보확인
		// 2번상인 정보 확인
		// 1번 상인에게 구매자가 망고 구매
		// 구매자 정보 확인
		// 1번상인 정보 확인
		// 2번상인 정보 확인
		
		Seller a = new Seller (1) ;
		Seller b = new Seller (1) ;
		OrangeSeller o = new OrangeSeller(5) ;
		Buyer c = new Buyer (4000) ;
		
		c.showBuyer();
		a.showSeller();
		b.showSeller();
		c.buyMango(a, 1);
		c.showBuyer();
		a.showSeller();
		b.showSeller();
		
		c.buyOrange(o, 6);
		c.showBuyer();
		
		
	}
}
