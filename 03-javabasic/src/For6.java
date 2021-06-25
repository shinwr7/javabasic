import java.util.Scanner;

public class For6 {
	public static void main(String[] args) {
		//Scanner로 정수 입력
		//입력받은 정수의 제곱 형태의 직사각형 찍히도록
		//중첩 반복문 작성
		//ex ) 3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int n1=0;n1<num;n1++ ) {
			for(int n2=0;n2<num;n2++)
			{System.out.print("*");
		}
			System.out.println();
		}
	}
}

