	
public class Unary01 {
	public static void main(String[] args) {
		//단항 연산자 ++, --
		// ++, --는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있습니다.
		// 왼쪽에 붙는 경우를 전위 수식
		// 오른쪽에 붙는 경우를 후위 수식으로 표현하며
		// 어느 방향에 붙냐에 따라 실행 순서가 바뀝니다.
		// ++는 대상 변수의 숫자를 1증가, --는 1감소 시킵니다.
		int a=1; 
		System.out.println(++a);
		//전위 수식, 실행 전 1부터 증가시키고 a 출력 
		// 1. 실행 전, a 의 값을 1 증가시키고  --> a = a + 1; --> 대입 연산자는 오른쪽에 있는 것을 먼저 계산하고 왼쪽으로 대입.
		// 2. 그 값을 출력 System.out.println(a(2));
		System.out.println(a); //a는 증가된 값이 유지됨 
		System.out.println(a++); //후위 수식, a(2) 출력 후 1 증가시킴
		//1. System.out.println(a(2)); 
		//2. a= a+1 ;
		System.out.println(a); //a 는 증가된 값이 유지됨 
	}
}
