package polymorphism;

public class Wooram extends Person{
	
	private String hobby;
	
	public Wooram(String name, int age, String hobby) {
		
		super(name,age);
		this.hobby=hobby;
		
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("취미 : "+ hobby);
		System.out.println("-----------");
	}
}
