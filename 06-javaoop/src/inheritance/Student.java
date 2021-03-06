package inheritance;

public class Student extends Person{
	
	//공통속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의 
	// 상속을 하면 내부에 클래스는 사실상 2개임을 기억! 
	public String major;
	public String school;
	public boolean scholarship;
	
	public void getStudentInfo() {
		getPersonInfo();
		System.out.println("전공은 " + major + "입니다.");
		System.out.println("학교는 " + school + "입니다.");
		System.out.println("장학 여부 : "+ scholarship );
	}
}
