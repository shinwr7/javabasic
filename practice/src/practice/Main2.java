package practice;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		int count = 0;
		String[] rsp= {"가위", "바위", "보"} ;
	
		Random r = new Random();
		Scanner sc = new Scanner(System.in); 
		System.out.println("몇 번의 승부를 원하십니까?");
		int b = sc.nextInt();
		int loop=0;
		System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
			 while(loop<=b) {
				 loop+=1;
				 int i = r.nextInt(3);
				 String a = sc.nextLine() ;
				 
				 		if(a.equals(rsp[i])) {
						System.out.println("비겼습니다.");
						System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
						continue;
						}
						
					 	if(a.equals("가위")&&rsp[i].equals("바위")) {
							System.out.println("졌습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
							}
						if(a.equals("가위")&&rsp[i].equals("보")) {
							count+=1;
							System.out.println("이겼습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
						}
							
						if(a.equals("바위")&&rsp[i].equals("보")) {
							System.out.println("졌습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
						}
						if(a.equals("바위")&&rsp[i].equals("가위")) {
							count+=1;
							System.out.println("이겼습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
						}
						if(a.equals("보")&&rsp[i].equals("가위")) {
							System.out.println("졌습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
						}
						if(a.equals("보")&&rsp[i].equals("바위")) {
							count+=1;
							System.out.println("이겼습니다.");
							System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
							continue;
						}
						
						
				 
				 }
				 	 	
			 System.out.println("총 승수? "+ count);
			 count=0;
				 }
					 
					 }
				
				 
			 
			 
		 
		 
	

