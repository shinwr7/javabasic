import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		if (a>=0) { 
			System.out.println("0보다 크거나 같습니다.");
		}
		if (a<0) { 
			System.out.println("0보다 작습니다.");
			
		}
		sc.close();
		}
}
