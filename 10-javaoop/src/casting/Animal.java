package casting;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//동물의 행동을 하나 메서드로.
	
	public void eat () {
		System.out.println("먹습니다.");
	}
	
	
}
