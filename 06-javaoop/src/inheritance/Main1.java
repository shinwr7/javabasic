package inheritance;

public class Main1 {
	public static void main(String[] args) {
		//Student는 Person을 상속했기 때문에
		//Student는 Person의 자원을 사용할 수 있습니다. 
		
		
		Student s1 = new Student();
		s1.name="신우람";
		s1.age =29;
		s1.major="호텔경영학과";
		s1.school="세종대";
		s1.scholarship=true;
				
		s1.getPersonInfo();
		s1.getStudentInfo();
	}
}
