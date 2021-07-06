package string1;

public class String9 {
	public static void main(String[] args) {
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.
		
		String str = "                  Hello         Java       ";
		System.out.println(str.trim());
		
		// replace()를 이용해서 공백 전체를 없애보세요 .
		
//		String b = str.trim();
//	
//		System.out.println(b.replace(" ", ""));
//		
//		b=b.replace(" ", "");
//		//trim()과 replace()를 이용해 Hello Java 사이의 공백을
//		//한칸만 남겨보세요.
//		
//		System.out.println(b.replace("o", "o "));
		
		//2칸 묶음씩만 없앤다 -> 띄어쓰기 홀수칸이면 ? 결국 한칸만 남음.
		System.out.println(str.trim().replace("  ", ""));//메서드 체이닝(메서드 연달아)
	}
}
