package polymorphism;

public class Salaryman extends Person{
	public int salary ;
	public Salaryman (String name, int age, int salary) {
		
		super(name,age);
		this.salary=salary;
	}
	public void showPerson () {
		super.showPerson();
		System.out.println("연봉 : "+ salary);
		System.out.println("--------------");
	}
	
}
