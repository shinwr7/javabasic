package string1;

public class String7 {
	public static void main(String[] args) {
		//substring()은 인덱스 기준으로 앞 문자열을 삭제합니다. 
		//인덱스 번호를 두 개 주면 처음 인덱스번호 ~ 두번째 인덱스번호 사이만
		//남겨줍니다. 
		
		
		
		String str = "자바자바JSPJSP스프링스프링";
		//substring(5) -> 인덱스번호 5를 새로운 시작점으로 잡겠다. 
		String result = str.substring(5);
		
		System.out.println(result);
		
		//인덱스번호 10 이상 15미만! 즉 인덱스번호 15는 포함되지 않는다.
		// 인덱스번호 15 부터는 생략됨 . 10부터 15 [직전]까지다 라고 외워. 
		result = str.substring(10, 15);
		System.out.println(result);
	}
}
