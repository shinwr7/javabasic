package structure;

public class PersonClass {
	// 사람 정보를 Person처럼 정의해주세요.
	// 여러분들이 추가하고 싶은 특성을 하나 더해주세요.
	
	public String name;
	public int age;
	public String pNum;
	public String address;
	public boolean glasses;
	
	// 추가로 아까의 조회 메서드를 생성해주세요.
	// 클래스 내부에 생성할때는 static이 필요 없습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	
	public void getInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(pNum);
		System.out.println(address);
		System.out.println(glasses);
		
		
	}
	
}
