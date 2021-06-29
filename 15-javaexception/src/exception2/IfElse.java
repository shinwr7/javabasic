package exception2;

import java.util.Scanner;

public class IfElse {
	// int a, b에 스캐너로 각각 정수 입력을 받아주세요.
	// a / b 의 결과를 콘솔창에 띄워주시되
	// if~else 문을 이용해 0으로 나누는 에러발생이 일어나기 전에
	// 나누는 수에는 0을 입력할 수 없습니다. 라고 경고만 띄우도록 처리해주세요.
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1번째 정수를 입력하세요.");
	int a = sc.nextInt();
	System.out.println("2번째 정수를 입력하세요.");
	int b = sc.nextInt();
	
	if(b==0) {
		System.out.println("나누는 수에는 0을 입력할 수 없습니다.");
		
	}else
	{
		System.out.println(a+"와"+b+"(을)를 나눈 결과는 : "+a/b);
	}
}
	
}
