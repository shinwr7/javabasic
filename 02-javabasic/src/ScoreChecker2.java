import java.util.Scanner;

public class ScoreChecker2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println((score>=95)?"A+":"A0");
		}
		else if(score>=80) {
			System.out.println((score>=85)?"B+":"B0");
		}
		else if(score>=70) {
			System.out.println((score>=75)?"C+":"C0");
		}
		else if(score>=60) {
			System.out.println((score>=65)?"D+":"D0");
		}
		else {
			System.out.println("F");
		}
		}

		}
		
		
	
	
