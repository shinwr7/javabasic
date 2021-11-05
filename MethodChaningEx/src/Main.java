
public class Main {

	public static void main(String[] args) {
		
		ChainTest test = new ChainTest();
		
		test.plusThis().plusThis().plusThis();
		
//		test.getNum().getNum(); // int 타입 리턴하므로 .. 
//		
//		System.out.println(test.getNum());
//		System.out.println(test.showNum()); // showNum의 리턴 자료형 void ! 
	}
}
