package exception2;

import java.util.Scanner;

public class TryCatch1 {
	//try~catch 구문은 크게 예외가 발생할 수 있는 구문을 적는
	// try블럭과, 예외 발생시 처리할 catch 블럭으로 나뉩니다.
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1번 정수를 입력하세요.");
	
		int a = scan.nextInt();
	System.out.println("2번 정수를 입력하세요.");
	
		int b = scan.nextInt();

	try {
		// 예외가 발생할 구문을 적는 블록. try블록은
		// 반드시 하단에 catch 블록이 추가로 작성되어야 한다.
		System.out.println(a/ b);
		System.out.println("계산 끝!");
		
	}catch(Exception e) {
		//catch블록에는 (Exception e)가 기본적으로 들어간다
		// 추후 특정한 종류의 예외만 처리하고 싶을 때 다른 자료형을
		// 적어주면 된다. 
		// Exception e 는 만능 예외처리 !
		System.out.println("나누는 숫자는 0이 될 수 없습니다.");
	}finally {
		// 모든 실행구문이 끝나고 실행할 코드는 
		// finally 블럭 내부에 작성합니다. 
		// 굳이 안써도 되긴 하지만, try, catch 구문 즉, 
		// 에러 확인 관련 내용이면 finally 안에 작성해준다.
		System.out.println("코드 끝!");
	}
	
	}
}
