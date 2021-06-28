package casting;

public class MainInstanceof {
	
	public static void main(String[] args) {
		Animal c1 = new Chicken("닭둘기", 3);
		
		
		//현재 Animal 타입인 c1의 근본자료형이 Chicken인지를 검사
		System.out.println(c1 instanceof Chicken);
		
		//현재 Animal 타입인 c1의 근본자료형이 Dog인지를 검사
		System.out.println(c1 instanceof Dog);
		//현재 Animal 타입인 c1의 근본자료형이 Animal인지를 검사
		System.out.println(c1 instanceof Animal);
		
		Chicken chicken = (Chicken)c1;
		System.out.println(chicken instanceof Animal);
		//치킨 타입으로 바꿨는데 왜 애니멀 인스턴스로 잡히는가? 
		//chicken 이라는 객체가 Chicken 즉, 자식만의 메서드를 사용할 수 있는 이유?
		// 즉, 타입 강제 변환 -> 주체를 바꿔준다는 개념!
		// 메서드를 사용할 주체! 
	}
}
