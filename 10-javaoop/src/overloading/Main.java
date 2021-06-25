package overloading;

public class Main {
	// 오버로딩은 과적재 라는 뜻으로 같은 이름의 메서드를
	// 한 공간에 여럿 정의하는 것을 의미합니다.
	// 자바는 메서드를 구분할 때 이름으로도 구분하지만
	// 파라미터의 갯수, 자료형으로도 구분합니다. 
	// 오버로딩은 메서드 이름은 같지만 파라미터의 종류가 달라도
	// 자바에서 호출구분이 되는 것을 감안해 허용되는 문법입니다.
	public static void over(int a) {
		System.out.println("출력 : "+ a);
	}
	public static void over(int a, int b) {
		System.out.println("출력2 : "+a+","+ b);
	}
	public static void over(String a) {
		System.out.println("출력3 :" + a);
	}
	
	public static void main(String[] args) {
		over(5);
		over("123");
		over(4,5);
	}
}
