package constructor;

public class Main3 {
	public static void main(String[] args) {
		
		BasketballPlayer p1 = new BasketballPlayer(190,110,"LA", 100);
		p1.dunk();
		p1.dunk();
		p1.dunk();
		p1.dunk();
		p1.dunk();
		p1.dunk();
		
		BasketballPlayer p2 = new BasketballPlayer(150,110,"NY", 100);
		p2.dunk();
		p2.dunk();
		p2.dunk();
		p2.dunk();
	}
}
