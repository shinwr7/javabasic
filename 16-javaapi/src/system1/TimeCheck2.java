package system1;

import java.util.Random;
import java.util.Scanner;

public class TimeCheck2 {
	public static void main(String[] args) {
		// tryCatch 구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 예외를 발생시켜 주세요.
		
		
		long start = System.currentTimeMillis();
		System.out.println("시작 시간" + start);
		try {
			
		Scanner sc = null;
		sc.nextInt();
		
		Random r = null;
		r.nextInt();
		
		Integer i = null;
		i.byteValue();
		}
		
		catch (Exception e){ 
			System.out.println("예외 발생");	
		}
		System.out.println("종료");
		long end = System.currentTimeMillis();
		System.out.println("종료 시간" +end);
		System.out.println((end-start)+"밀리초 경과");
	}
}
