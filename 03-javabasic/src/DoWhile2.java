import java.util.Scanner;
//다시 풀어보기! 
public class DoWhile2 {
	public static void main(String[] args) {
		// 배달어플을 만든다.
		// 주문 금액을 입력받는다 .
		// 주문금액이 15000 미만이면 프로그램이 멈춘다.
		// 주문금액은 Scanner를 이용해 order 변수에 직접 입력받는다. 
		// 단, do while로 작성해 첫 주문은 주문금액이 15000미만이어도 
		// "배달을 완료했습니다." 라고 출력한 뒤
		// 다시 주문금액을 입력받는 로직을 반복문 내부에 작성해.
		Scanner sc = new Scanner(System.in);
		System.out.print("주문 금액 : ");
		int order = sc.nextInt();
		
		do {
			System.out.println("주문 금액은" + order + "원 입니다."); 
			System.out.println("배달을 완료했습니다."); 
			System.out.println("다음 배달금액을 입력해주세요."); 
			order = sc.nextInt();
		
		} while(order>=15000);
		System.out.println("배달 금액이 모자라 배달 서비스가 종료되었습니다.");
		
			
		
}}

