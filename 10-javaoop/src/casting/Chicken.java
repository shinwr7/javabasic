package casting;

public class Chicken extends Animal{
	
	
	public Chicken (String name, int age) {
		super(name, age);
	}
	
	public void egg () {
		System.out.println("닭이 알을 낳습니다.");
	}
	
	public void eat() {
		System.out.println("닭이 밥을 먹습니다.");
	}
}
