package final3;

public class Main {
	public static void main(String[] args) {
		// final 변수를 사용하기 위한 Country 객체 생성 불필요
		// 일반적으로 상수를 쓰는 경우는
		// 한 군데만 수정해도 전체 프로그램에 수정내용이
		// 반영되게 만들고 싶을 때 사용
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		
		
		
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
		System.out.println("한국 넓이는 : " +Country.KOREA);
	}
}
