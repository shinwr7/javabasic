package accessmodifier3;

import accessmodifier2.Child;

public class Main1 {
	public static void main(String[] args) {
		// 패키지가 다른 (accessmodifier 2의) child를 생성.
		// 패키지가 다르면 import까지 해줘야 쓸 수 있음.
		Child c1=new Child();
		//1. public 접근 제한자
		System.out.println(c1.a);
		//2. protected 접근 제한자
//		System.out.println(c1.b);
//		//3. private 접근 제한자
//		System.out.println(c1.c);
//		//4. default 접근 제한자
//		System.out.println(c1.d);
	}
}
