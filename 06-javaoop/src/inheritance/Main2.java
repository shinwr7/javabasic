package inheritance;

public class Main2 {
	public static void main(String[] args) {
		
		Salaryman s1 = new Salaryman();
		s1.name = "신우람";
		s1.age = 29;
		s1.salary = 3000;
		s1.upSalary();
		s1.getSalaryInfo();
		
		Student a = new Student();
		a.name ="신우람";
		a.age = 20;
		a.major = "호텔경영";
		a.school = "세종대";
		a.scholarship = true;
		a.getStudentInfo();
	}
}
