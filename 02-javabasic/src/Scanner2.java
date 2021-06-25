import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		//Scanner 생성
		
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력받는 경우
		
		String name = sc.nextLine();
		
		//실수를 입력받는 경우
		double height = sc.nextDouble();
		
		System.out.println(name+height);
		//name = String, height = double 인데, 
		//연산식에 String이 껴있다고 판단되는 순간 그 즉시 뒤의 모든 부분이 문자열로 바뀜.
		//즉, 문자열로 출력됌.
		sc.close();
		
		
		
	}
}
