import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		//환율 계산기!
		
		Scanner sc = new Scanner(System.in);
		double rate = 0.0986 ;
		System.out.println("일본의 환율은"+rate+"입니다.");
		System.out.print("원화 금액을 입력해주세요 : ");
		int won = sc.nextInt();
		System.out.printf("원화%d원을 일본 엔화로 환전시 %.0f엔 입니다.", won, won*rate);
		// System.out.println(Math.round (won*rate) + "엔입니다.");
		sc.close();
		
	}
}
