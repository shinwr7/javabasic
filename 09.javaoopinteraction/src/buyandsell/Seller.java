package buyandsell;

public class Seller {
	// 판매자
	// 돈, 망고를 가진다. 
	private int money, mango;
	
	public Seller (int mango) {
		this.mango=mango;
		this.money=0;
	}	
	
	public void sellMango(int mango) {
		if(this.mango-mango<0) {
			System.out.println("재고 부족");
			return;
		}
		this.money+=mango*1000;
		this.mango-=mango;
//		System.out.println("망고를 "+mango+"개 판매하였습니다.");
	}
	
	public void showSeller () {
		System.out.println("-----판매자 상태-----");
		System.out.println("소지 금액 : " +  this.money);
		System.out.println("소지 망고 : " +  this.mango);
	
	}

	public int getMango() {
		return mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}
	
	}

	//생성자에서 망고갯수를 입력받을 수 있다.
	//돈은 0으로 넣어줘 .
	
	// 판매시 망고갯수를 입력할 수 있고 
	// 망고 갯수*1000 만큼의 돈이 올라가
	// 망고는 판 갯수 만큼 차감된다. 
	// 0미만으로 망고가 줄어들 순 없다.
	
	// showSeller 를 이용해 현재 남은 망고와 돈을 볼 수 있다. 
	

