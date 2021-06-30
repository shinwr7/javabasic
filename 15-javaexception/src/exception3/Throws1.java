package exception3;

public class Throws1 {
	
	// 특정 메서드 영역에서 발생하는 코드는 엄밀히 말하면 try 블럭 외부의 
	// 예외 발생으로 간주됩니다. 
	// 따라서 개념적으로는 try 블럭 밖에 있지만 실제로는 try 블럭에 속한것처럼
	// 처리하기 위해 throws 를 사용자 정의 메서드 뒤에 붙여줍니다. 
	
	public static void doIt(String [] s, int i) {
			
			//throws ArrayIndexOutOfBoundsException {
			System.out.println(s[i]);
		}
	
	
	public static void main(String[] args) {
		
		String [] greetings = {"안녕", "hi", "니하오", "신짜오" };
		int i = (int)(Math.random()*5); //정수 0, 1, 2, 3, 4
		try {
			doIt(greetings, i);
			
		} catch(Exception e) {
			System.out.println("main 지역에서 처리했습니다.");
		}
		
		}
}
