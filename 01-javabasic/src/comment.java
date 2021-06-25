
public class comment {
	//메인 메서드는 실행할 코드를 내부에 작성받습니다.
	public static void main(String[] args) {
		/* 이 영역 내부에 작성한 코드는
		 * 실행의 대상이 됩니다.
		 */
		System.out.println("Hello Java.");
		
		
		
		for(int num=0;num<5;num++) {
			System.out.println();
			for(int k=4-num;k>=0;k--) {
				System.out.print(" ");
			}
		
			
			for(int i= 1; i <= 2*num+1; i++) {
		System.out.print("*");
		
		}
		

		
		}}}
	//메인 메서드 종료지점