package practice;

import java.util.Collections;
import java.util.List;

public class Lotto4 {
	public static void main(String[] args) {
		
		int[] lottoNum = new int [45];
		int i=0;
		for(;i<45;i++) {
			lottoNum[i]=i+1;
		}
		 
	
		for(int a=0;a<6;a++) {
			i=(int)(Math.random()*45+1);
			System.out.println(lottoNum[i]);
		}
		
		
		
//		int [] lotto=Collections.shuffle(lottoNum);
		
		String test = "test";
		System.out.println(test.charAt(0));
	
		
	}
		
	
	}

