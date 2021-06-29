package abstract1;


// 추상 클래스.
// abstract 선언이 붙은 클래스는 new 를 이용한
// 직접적인 객체 생성이 불가능하다.

public abstract class Parent {
// 클래스 안에 추상 메서드가 하나라도 있으면 
// 클래스도 abstract 붙여줘야함.
	
		public int a ;
		public Parent() {
			this.a = 5;
		}
		
		//추상 메서드, 아래와 같이 실행문 없이 작성.
		public abstract void getA();
		
		//추상 클래스 내부의 일반 메서드는 그냥 평범하게 작성한다. 
		public void getInfo() {
			System.out.println("일반 메서드입니다.");
		}

}

	
