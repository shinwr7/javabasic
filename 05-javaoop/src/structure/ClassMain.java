package structure;

public class ClassMain {

	public static void main(String[] args) {
		
		// Person 2명을 만들어보겠습니다. 
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		// Person2명 정보를 직접 기입해주세요.
		
		
		person1.name = "신우람";
		person1.age = 29;
		person1.address = "월계동";
		person1.pNum = "010-4100-8149";
		person1.glasses = true;
		
		person2.name = "이주석";
		person2.age = 29;
		person2.address = "전농동";
		person2.pNum = "010-1110-8132";
		person2.glasses = true;
		
		person1.getInfo();
		person2.getInfo();
	}
	

}
