package accessmodifier;

public class Main2 {
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("월계동파이리");
		
//		w1.hunt();
//		w1.hunt();
//		w1.hunt(); 
//		w1.hunt(); //private 이지만 에러 안뜸
		
		
//		System.out.println("아이디 : "+ w1.id);
//		System.out.println("레벨 : " + w1.level);
//		System.out.println("체력 : " + w1.hp);
//		System.out.println("공격력 : " + w1.atk);
//		System.out.println("경험치 : " + w1.exp);
								//private이 걸려있는 변수를 직접적으로 언급하면 에러
		
		Warrior w2= new Warrior("김전사");
		
		w2.hunt();
		w2.hunt();
		
		
	}
}
