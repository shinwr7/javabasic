package exception1;

public class Exception5 {
	public static void main(String[] args) {
		// 예외발생 케이스5.
		// 숫자베이스가 아닌 문자를 숫자로 바꾸려고 할 때 에러 발생
		String a= "123ㅂㄱ";
		int result = Integer.parseInt(a);
		System.out.println(result);
	}
}
