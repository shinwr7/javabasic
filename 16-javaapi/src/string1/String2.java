package string1;

public class String2 {
	public static void main(String[] args) {
		// indexOf() 는 특정 문자열의 시작 인덱스 값을 반환합니다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴합니다.
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		System.out.println(get);
		
		
		
		//중복 문자 처리
		get = tomato.indexOf("to",1); 
		//뒤에숫자? 몇번 인덱스부터 조회할 것인지.
		//즉, 1번 인덱스 value인 "o"부터 조회하므로
		//4번 인덱스부터 나오는 "to" 를 조회해줌.
		
		System.out.println(get);
		
		
		//없는 문자열 처리
		get= tomato.indexOf("banana");
		System.out.println(get);
	}
}
