package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoMachine {
	List<Integer> lottoMachine = new ArrayList<>();
	private int [] sixNum = new int [6];
	
	public List<Integer> getLottoMachine() {
		return lottoMachine;
	}

	public void setLottoMachine(List<Integer> lottoMachine) {
		this.lottoMachine = lottoMachine;
	}

	public int[] getSixNum() {
		return sixNum;
	}

	public void setSixNum(int[] sixNum) {
		this.sixNum = sixNum;
	}

	public LottoMachine() {
		for(int ball=1;ball<=45;ball++) 
			lottoMachine.add(ball);
			System.out.println("로또 머신 구동 준비");
	}
	
	public void shuffle() {
		System.out.println("로또번호가 적힌 공들을 섞습니다.");
		Collections.shuffle(lottoMachine);		
	}
	
	public void pickBalls() {
		System.out.println("6개 공을 뽑습니다.");
		
		for(int loop=0;loop<=5;loop++) {
			sixNum[loop]=lottoMachine.get(loop+1);
		}
		Arrays.sort(sixNum);
		System.out.println(Arrays.toString(sixNum));
	}
	
	
}
