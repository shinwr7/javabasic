package string1;

public class String1 {
	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인1. charAt();
		String greeting = "Hello Java";
		char get = greeting.charAt(6); //index 번호 6 = 7번째 문자
		System.out.println(get);
		// System.out.println(greeting[6]); 
		// 자바는 문자열 인덱싱을 허용하지 않습니다. so, charAt() 으로만 검출해야함.
	}
}
