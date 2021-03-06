package structure;

public class Structure1 {
	public static void main(String[] args) {
		
		//Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person a =new Person();
		//a 라는 구조체에 이름, 나이, 폰번호를 입력합니다. 
		
		a.name="신우람";
		a.age= 20;
		a.pNum = "010-1234-5678";
		a.address = "노원구 월계동";
		// 입력된 자료를 하나하나 출력합니다.
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		System.out.println(a.address);
		
		// 또 다른 사람을 하나 만들어봅시다. 
		Person b = new Person();
		b.name = "김철수";
		b.age=25;
		b.pNum="010-1313-1322";
		b.address="광진구 화양동";
		//입력된 자료를 하나하나 출력합니다. 
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pNum);
		System.out.println(b.address);
	}
}
