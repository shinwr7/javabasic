package stringbuilder1;

public class Builder5 {
	public static void main(String[] args) {
		// 다음 문자열의 문자를 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		StringBuilder a = new StringBuilder("abcdefghikaadf");
		
		
		for(int i=1;i<a.length();i++) {
			if(i%2==0) {
				a.deleteCharAt(i);
				
			}
		}
		System.out.println(a);
		
		
		// i = 1
		// i = 2 -> 
		// 
}}
