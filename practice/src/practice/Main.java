package practice;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		String[] rsp= {"가위", "바위", "보"} ;
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
		String a = sc.nextLine() ;
		if(a.equals("가위")|a.equals("바위")|a.equals("보")) {

		System.out.println("판수를 입력하세요.");
		int b = sc.nextInt();
	
		
		for(int loop=0;loop<b;loop++) {
			Random r = new Random();
			int i=r.nextInt(3);
						if(a.equals(rsp[i])) {
				System.out.println("비겼습니다.");
			
		}if(a.equals("가위")&&rsp[i].equals("바위")) {
			System.out.println("졌습니다.");
		}if(a.equals("가위")&&rsp[i].equals("보")) {
			count+=1;
			System.out.println("이겼습니다.");
			
		}if(a.equals("바위")&&rsp[i].equals("보")) {
			System.out.println("졌습니다.");
		}if(a.equals("바위")&&rsp[i].equals("가위")) {
			count+=1;
			System.out.println("이겼습니다.");
			
		}if(a.equals("보")&&rsp[i].equals("가위")) {
			System.out.println("졌습니다.");
		}if(a.equals("보")&&rsp[i].equals("바위")) {
			count+=1;
			System.out.println("이겼습니다.");
			
		}
		}System.out.println("총 승수 : "+ count);
			
		}else {
			System.out.println("가위, 바위, 보만 입력하세요. 쳐맞기싫으면");
		}
	}
}
