package system1;

public class TimeCheck1 {
	public static void main(String[] args) {
		// currentTimeMills의 자료는 long형에 저장합니다. 
		// 시작 지점
		
		long start = System.currentTimeMillis();
		// System.out.println(start/1000/60/60/24/365); -> 51년 지난 시점
		System.out.println(start); //콘솔창에 찍히는 숫자? 
					//1970년 1월1일00분00초000~밀리초 + 그 숫자(밀리초)만큼 지난 시점임을 나타냄.
		long all = 0;
		
		for(int i =0;i<2000000000; i++) {
			all +=1;
		}
		
		//끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println(end);
		//소요시간 측정
		System.out.println(end-start);
	}
}
