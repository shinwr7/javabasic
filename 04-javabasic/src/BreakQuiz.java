import java.util.Scanner;

public class BreakQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int n = sc.nextInt();
		int total = 0;
		int i=0;
		while (true) {
			i+=1;
			total +=i;
			System.out.println("1부터" + i+"까지의 총합은"+total+"입니다.");
			if(total>=n) {
				System.out.println("목표값 : "+ n);
				System.out.println("총합 : "+ total);
				System.out.println("몇 까지 더했나? : "+i);
				break;
			}
		
		}
	}
}
