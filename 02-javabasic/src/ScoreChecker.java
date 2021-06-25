import java.util.Scanner;

public class ScoreChecker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score>=95) {
			System.out.println("A+");
		}
		else if(score>= 90) {
			System.out.println("A0");
		}
		else if (score >= 85) {
			System.out.println("B+");
		}
		else if (score >= 80) {
			System.out.println("B0");
		}
		else if (score >= 75) {
			System.out.println("C+");
		}
		else if (score >= 70 ) {
			System.out.println("C0");
		}
		else if (score >= 65) {
			System.out.println("D+");
		}
		else if (score >= 60) {
			System.out.println("D0");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}
}
