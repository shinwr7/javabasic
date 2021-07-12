package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto5 {
	public static void main(String[] args) {
		
		
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

		System.out.println(Arrays.toString(lottoN));
		
	}
}
