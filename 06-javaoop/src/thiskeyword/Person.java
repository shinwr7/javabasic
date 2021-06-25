package thiskeyword;

public class Person {
	//사람의 정보를 여기에 기입합니다.
	public String name; 
	public int age;
	public int money;
	public String major;
	
	
	//생성자 활용
	
	public Person(String name, int age, int money, String major) {
		
	this.name=name;
	this.age=age;
	this.money=money;
	this.major=major;
	// this. -> 호출되고있는 번지수 즉, 힙의 주소값을 입력시켜줌.
	// ex) i1에 할당된 주소값이 100번지라고 할때, this. -> 100번지 를 뜻함.
		}
	//getInfo()를 이용해 조회합니다.
	public void getInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("소지 금액 : "+ money);
		System.out.println("전공 : "+ major);
	}
	
}
