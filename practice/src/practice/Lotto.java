package practice;

import java.util.Arrays;
import java.util.Random;


public class Lotto {
	public static void main(String[] args) {
		
		Random r = new Random();
	
		int lottoNum[] = new int [6];
		
	for(int i = 0;i<=5;i++) {
		lottoNum[i] = r.nextInt(44)+1;
			for(int k = 0;k<i;k++) {
				if(lottoNum[i]==lottoNum[k]) {
					i--;
					break;
				}
		}
	}for (int i =0;i<6;i++) {
	System.out.print(lottoNum[i]+ " ");
	}
	
	
	}
		
	
		
		
		
//		for(int loop=0;loop<6;loop++) {
//			
//			System.out.println(lottoNum[i]+1);
			
		}
		
		
		
	

