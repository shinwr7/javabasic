package buyandsell;

public class Main {

	public static void main(String[] args) {
		
		Seller s = new Seller(3);
		Buyer b = new Buyer(5000) ;
//		b.showBuyer();
		b.buyMango(s, 4);
		b.showBuyer();
		s.showSeller();
//		s.sellMango(20);
//		s.showSeller();
//		s.sellMango(6);
//		s.showSeller();
		
	}
		
}
