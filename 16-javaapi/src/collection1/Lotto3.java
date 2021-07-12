package collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto3 {
	public static void main(String[] args) {
		//로또복권 당첨 시뮬레이터 만들기
		// 1.당첨번호 6개 뽑기
		// 2.추첨번호 6개 뽑기
		// 3. 당첨번호와 추첨번호 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개 뽑고 
		// 이어서 비교해서 일치여부 검사
		
		List<Integer> lotto = new ArrayList<>();
		
		for(int num=1;num<46;num++) {
		lotto.add(num);
		}
		
		Collections.shuffle(lotto);
		
		
		int [] lottoN = new int [6];
		for(int loop=0;loop<6;loop++) {
		lottoN[loop]=lotto.get(loop+1);
		}
		Arrays.sort(lottoN);
		String lottoNumber = Arrays.toString(lottoN);
		
		int tryTime = 0;
		while(true) {
			Collections.shuffle(lotto);
			
			for(int loop=0;loop<6;loop++) {
			lottoN[loop]=lotto.get(loop+1);
			}
			Arrays.sort(lottoN);
			System.out.println("이번에 뽑힌 번호 : " +Arrays.toString(lottoN));
			tryTime+=1;
			if(Arrays.toString(lottoN).equals(lottoNumber)) {
				System.out.println("당첨 번호 :"+ lottoNumber);
				System.out.println("추첨 번호 :"+ Arrays.toString(lottoN));
				System.out.println("총 로또복권"+(long)(tryTime*1000)+"원 사고서야 1등에 당첨되었습니다.");
				return;
			}
			
		}
		
		
		
		
		
	}
}
