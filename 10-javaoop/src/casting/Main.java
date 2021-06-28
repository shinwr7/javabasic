package casting;

public class Main {
	public static void main(String[] args) {
		
	
	Animal c1 = new Chicken ("닭둘기",1) ;
	Animal d1 = new Dog ("개순이",2);
	Animal a1 = new Animal ("동물", 5) ;
	c1.eat();
	d1.eat();
	a1.eat();
	
	//자식타입을 베이스로 만든 부모타입 변수는 
	//자식타입으로 강제로 바꿀 수 있다.
	
	Chicken chicken = (Chicken)c1;
	
	//원타입으로 돌려놓으면 원타입만의 메서드도 호출이 가능합니다.
	chicken.egg();
	
	Dog dog = (Dog) d1;
	dog.bark();
	
	//근본이 Animal인 경우는 다른 타입으로 변형이 안됩니다.
	Chicken chicken2 = (Chicken) a1;
	chicken2.egg();
	
}
}