package stringbuilder1;

public class Builder4 {
	public static void main(String[] args) {
		// String 관련에서 CharAt은 기본적으로 한 글자를 의미합니다.
		// deleteCharAt은 그래서 문자열 내부에서 딱 한글자만 삭제하는
		// 로직을 의미합니다.
		
		StringBuilder a = new StringBuilder ("abcdefadf") ;
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);
		
	}
}
