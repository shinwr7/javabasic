package practice;

import java.util.Arrays;

public class main3 {
	public static void main(String[] args) {
		
		LottoMachine lotto1 = new LottoMachine();
		
		lotto1.shuffle();
		lotto1.pickBalls();
		
		LottoMachine lotto2 = new LottoMachine();
		
		int count = 1;
		boolean i = true;
		while(i)
			if((Arrays.toString(lotto1.getSixNum())).equals(Arrays.toString(lotto2.getSixNum()))) {
				System.out.println(count + "번 만에 1등에 당첨됐습니다.");
				System.out.println("당첨 번호 : "+Arrays.toString(lotto1.getSixNum()));
				System.out.println("추첨 번호 : "+Arrays.toString(lotto2.getSixNum()));
				i = false;
				return;
			}
		else {
			count+=1;
			i = true;
			System.out.println("1등 당첨 실패");
			lotto2.shuffle();
			lotto2.pickBalls();
		}
	
	
		}
	
		
	
}
