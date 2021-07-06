package string1;

import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
		
		//.length()와 charAt() 을 활용해 입력된 전체 문자열을
		// 한글자씩을 한줄씩 출력하는 로직을
		// 문자열은 Scanner로 입력받습니다.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String string = sc.nextLine();
		
		for(int loop=0;loop<string.length();loop++) {
			System.out.println(string.charAt(loop));
			}
	}
}
