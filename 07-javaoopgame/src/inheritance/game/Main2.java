package inheritance.game;

public class Main2 {
	public static void main(String[] args) {
		// Warrior를 생성해서 각종 스탯을 입력해주신 다음
		// getInfo()를 호출해주세요.
		
		Warrior w1 = new Warrior();
		w1.id = "전사";
		w1.lev = 10;
		w1.hp = 200;
		w1.mp = 100;
		w1.damage = 20;
		
		// getInfo()호출 시 Commoner의 getInfo()는 무시됩니다.
		// Warrior의 getInfo()가 우선적으로 호출됩니다. 
		w1.getInfo();
		
	}
}
