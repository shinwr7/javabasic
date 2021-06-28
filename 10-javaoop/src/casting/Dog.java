package casting;

public class Dog extends Animal{
	
	public Dog (String name, int age) {
		super(name, age);
		
	}
	
	public void bark() {
		System.out.println("개가 짖습니다.");
	}
	
	public void eat() {
		System.out.println("개가 밥을 먹습니다.");
	}
	
}


