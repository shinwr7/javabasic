package accessmodifier3;

import accessmodifier2.Parent;

public class Child2 extends Parent{
	// Child2는 accessmodifier3 패키지 소속
	// Parent 는 accessmodifier2 패키지 소속으로
	// 부모 자식간 클래스 소속이 다르다.
	protected int e;
	
	// Child2의 getB 메서드는 Parent 의 b 에 접근합니다. 
	// getB() 와 같이 내부 요소를 조회만 할 수 있고
	// 수정은 할 수 없게 제한하는 메서드를 
	// getter 라고 합니다. 
	public void getB() {
		System.out.println(b);
	}
	// b 변수의 값을 변경할 수 있도록 도와주는 
	// setB() 메서드를 작성해보세요.
	// b값은 음수가 될 수 없습니다.
	public void setB(int b) {
		//setter는 사용자의 선택폭을 제한할때 씁니다.
		
		if(b>0) {this.b=b;}
		else {}
		
	
		// getter는 위의 get() 처럼 특정 변수의 수치를
		// 콘솔에 찍어주는 유형도 있지만
		// 좀더 많이 사용하는 유형은 해당 변수의 값을
		// return 구문을 이용해 호출위치로 가져다 두는 형태를 더 많이 씁니다.
		// int를 리턴자료로 가지는 getBInt()를 추가로 아래에 작성해주세요 . 
		
	}
	public int getBInt() {
		return this.b;
	}
	
//	public void getC() {
//		System.out.println(c);
//	}
}
