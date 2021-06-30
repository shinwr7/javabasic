package string1;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 문장 입력하세요.");
		
		String all = sc.nextLine();
		
		int count = 0;
		boolean bool=true;
		int fidx = -1;
		
		System.out.println("문장 내에서 카운트할 단어를 입력해주세요.");
		String voca = sc.nextLine();
		
		while(bool) {
			int get = all.indexOf(voca,fidx+1);
			if(get ==-1) {
				bool=false;
			}else {
				fidx=get;
				count++;//글씨 카운트 증가
				System.out.println(get +"번에서"+count+"번째"+voca+"이(가) 검출되었습니다.");
			}
			
		}
		System.out.println(voca+"의 총 출현 횟수는"+ count + "입니다.");
		
		
	}
}
