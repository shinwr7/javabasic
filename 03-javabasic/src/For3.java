import java.util.Scanner;

public class For3 {
	//구구단 출력기를 만들어보겠습니다.
	//1~9중 하나의 숫자를 입력받습니다.
	//만약 1~9 범위를 벗어난 숫자가 입력된다면
	//범위 내의 수를 입력해주세요 라는 안내문구를 적고 종료합니다.
	//맞는 숫자가 들어온다면 결과예시처럼 출력합니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num= sc.nextInt(); 
		if (num>9|num<0)  
			{System.out.println("범위 내의 수를 입력해주세요.");
			System.out.println("프로그램 종료.");
			System.exit(0);}
		else {for (int n1 =1;n1<=9;n1++) 
				{
				System.out.println(num+ "*"+ n1 + "=" + num*n1);}
		sc.close();
	
		
			}
		}
 		
	}

