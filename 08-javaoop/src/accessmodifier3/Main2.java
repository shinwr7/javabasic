package accessmodifier3;

public class Main2 {
	public static void main(String[] args) {
		// 다른 패키지에서 상속받은 Child2를 확인해보겠습니다.
		Child2 child2= new Child2();
		
		//1. public 접근
		System.out.println(child2.a);
		//1-2. child2 내부의 e값 변경 및 접근
		
		System.out.println(child2.getBInt());
		//2. protected 접근
		// 	 protected는 같은 패키지, 혹은 다른 패키지라면 
		//   상속 관계일때만 접근 가능
		//System.out.println(child2.b); //--> 질문.. 왜안되는지 ;
		//3. default 접근 (패키지가 같으면 접근 가능)
//		System.out.println(child2.c);
//		System.out.println(child2.d);
	}
}
