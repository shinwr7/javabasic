
public class RecursiveClass {

	public static void recursive(int num) {
		
		if(num<=0) {
			System.out.println("재귀 탈출");
			return;
		}
		
		System.out.println("재귀호출중...");
		recursive(num-1);
	}
	
	public static void main(String[] args) {
		recursive(3);
	}
	
	
	
}
