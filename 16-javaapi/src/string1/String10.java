package string1;

public class String10 {
	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에 
		// 비교를 할 때 주소값 비교가 일어납니다.

		String a = new String("테스트1");//new 라는 키워드로 String 타입의 객체를 생성할때,
		String b = new String("테스트1");//각각 다른 새로운 주소값을 받게 된다. 
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		System.out.println(a.equals(b));
		
		
		String c = "테스트2";
		String d = "테스트2";
		System.out.println(c==d); //new 키워드 없으므로 c 와 d 는 동일한 주소값을 받음!
		System.out.println(c.equals(d));
	}
}
