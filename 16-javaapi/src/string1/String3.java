package string1;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		//Scanner 를 통해서 전체 문장을 입력받으세요.
		//다음으로 문장내에서 찾고싶은 단어를 입력받으세요 .
		//문장내에 있는 단어들의 인덱스번호와, 몇 개가 검출되었는지
		//출력해주는 코드를 작성해보세요. 
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 문장 입력하세요.");
		
		String all = sc.nextLine();
		int length = all.length();
		
		System.out.println("문장 내에서 카운트할 단어를 입력해주세요.");
		String voca = sc.nextLine();
		
		for(int loop=0;loop<=length;loop++) {
			//loop번째 인덱스부터 탐색 시작
			//loop는 문자열의 길이만큼 돌리기 위해 for문 사용
			int get = all.indexOf(voca, loop);
				//검출 결과가 -1일 경우에는 반복문 바로 탈출!
				//더이상 검출할 필요가 없음
				 if (get==-1) break;
				 //loop번째부터 탐색한 결과와
				 //loop+1번째부터 탐색한 결과가 다를 경우에는 검출된 것으로 봄.
				 if (get!=all.indexOf(voca, loop+1)) {
					 //검출되었으면  count +1 시켜줌
					 count +=1;
					 System.out.println(get + "번에서"+ count +"번째 "+ voca+"(이)가 검출되었습니다." );
				 }
		}
		
		System.out.println("총 출현 횟수 : " +count);
		
		
	}
}
