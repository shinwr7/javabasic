package abstract1;

public class Main {
	public static void main(String[] args) {
		//Parent 타입을 직접 생성 불가 
		//why? 힙 영역에 추상 클래스인 Parent 를 생성불가.
		//Parent p1 = new Parent () ;
		//그런 원리로 
		Parent p2 = new Child() ;
		//이건 되는데, Child 클래스가 추상클래스가 아니라서. 
		// -> 왼쪽 항은 사실상 힙에 위치한 데이터를 가리키는 표지판 역할만을 하기 때문에 추상 클래스도 작성 가능.
		
		
		//단 Parent를 상속받아 get A 메서드로 구체화시킨
		// Child 타입으로는 객체 생성 및 사용이 가능
		
		Child c = new Child();
		c.getA();
		//오버라이딩 없이 상속받은 일반 메서드도 호출 가능
		c.getInfo();
		
		
		
	}
}
