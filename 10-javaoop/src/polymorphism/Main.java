package polymorphism;

public class Main {
	public static void main(String[] args) {
		//부모타입인 Person 만으로도 양쪽 자료형을 모두 처리 가능. 
		Person sa1 = new Salaryman("김사원",31,3000);
		Person s1 = new Student("김학생", 19, 3);
		Person w1 = new Wooram("신우람", 29, "게임");
		//단 메서드는 Person을 베이스 객체는
		// Person에 정의된 메서드만 호출 가능
		
		sa1.showPerson();
		s1.showPerson();
		w1.showPerson();
	}
}
