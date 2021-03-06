package structure;

public class Structure2 {
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	
	public static void getCatInfo(Cat p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.figure);
	}
	
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	public static void main(String[] args) {
		// 사람 두명 만들어보세요.
		
		Person a = new Person();
		a.name = "신우람";
		a.age = 29;
		a.pNum="010-4100-8149";
		a.address="경기";
		
		
		Person b = new Person();
		b.name = "김경보";
		b.age = 29;
		b.pNum="010-4131-1412";
		b.address="서울";
		
		getInfo(a);
		getInfo(b);
		
		
		Cat q = new Cat();
		q.name = "초리";
		q.age = 4;
		q.figure = "코숏";
		
		Cat w = new Cat();
		w.name = "비비";
		w.age = 3;
		w.figure = "터키쉬 앙고라";
		
		getCatInfo(q);
		getCatInfo(w);
	}
}
