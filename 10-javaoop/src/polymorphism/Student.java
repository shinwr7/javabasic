package polymorphism;
//부모 클래스를 Person 으로 가지는 클래스
public class Student extends Person{
	
	private int grade;
	
	//super()를 이용해 초기화하는 생성자를 만들어주세요.
	public Student(String name, int age, int grade) {
		//부모쪽의 생성자에게 넘겨주기 위해 
		// 생성자 내부에서 super()를 사용한다.
		// 자식쪽 생성자에서 super(전달자료 1, 전달자료 2...);
		// 를 사용하면 부모 생성자에게 전달된다.
		
		super(name, age);
		this.grade = grade;
		
	}
	//상속받은 showPerson을 활용한 showStudent 를 작성해주세요.
	
	public void showPerson () {
		super.showPerson();
		System.out.println("학년 : "+ grade);
		System.out.println("-----------");
	}
	//부모쪽의 showPerson()을 오버라이딩해서 자식쪽에 재정의
	//재정의된 메서드는 부모 타입으로도 자식 쪽에서 호출가능하다.
	
	
}
