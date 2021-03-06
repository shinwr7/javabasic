package buyandsell;

public class Buyer {
		//구매자
		//구매자는 돈, 망고갯수를 맴버변수로 가집니다.
		//은닉 구현을 위해서 private로 처리합니다.
	private int money, mango, orange;
	
	public Buyer (int money) {
		this.money = money;
		this.mango=0;
		this.orange=0;

	}
	
	public void buyMango (Seller seller, int mango) {
		if(mango*1000>money) {
			System.out.println("돈이 모자라서 살 수 없습니다.");
			return;
		}
		if (seller.getMango()<mango) {
			System.out.println("재고 부족으로 구매하지 못합니다.");
			return;
			
		}
		this.money-=mango*1000;
		this.mango+=mango;
		seller.sellMango(mango);
		System.out.println("망고를 "+ mango+"개 구매하였습니다.");
		
		
		
//		if(this.money-mango*1000<0) {
//		 System.out.println("소지 금액이 부족합니다.");
//		}
//		else {
//		this.mango += mango;
//		this.money=money-mango*1000;
//		}
		}
	public void buyOrange (OrangeSeller o, int orange) {
		
		if(this.money<orange*1000) {
			System.out.println("돈이 모자라서 살 수 없습니다.");
			return;
		}
		
		if(o.getOrange()<orange) {
			System.out.println("재고 부족으로 구매 불가");
			return;
		}
			o.sellOrange(orange);
			this.money -= orange*1000;
			this.orange += orange;
		
	}
	
	
	public void showBuyer () {
		System.out.println("-----구매자 상태-----");
		System.out.println("소지 금액 : " + this.money);
		System.out.println("소지 망고 : " + this.mango);
		System.out.println("소지 오렌지 : "+ this.orange);
	}
		//생성자는 (int money)를 받아 돈을 초기화합니다.
		//망고는 자동으로 0을 대입합니다.
		
		// BuyMango는 망고를 삽니다.
		// (int mango)로 망고 갯수를 입력받으면, 망고 *1000만큼의 
		// 돈을 차감하고 망고 변수에 그만큼 갯수를 늘려줍니다.
		// 현실에서 망고를 구매할 때 구매자가 가게를 고르지
		// 가게에서 구매자를 선택하지 않으므로, Seller 변수를
		// Buyer가 고를 수 있도록 파라미터 설정을 합니다.
	
	
		// ShowBuyer는 구매자의 상태를 보여줍니다.	
		// money, mango 수치가 각각 몇인지 콘솔에 찍어줍니다.
}
