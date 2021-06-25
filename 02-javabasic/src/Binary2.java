
public class Binary2 {

	public static void main(String[] args) {
		// 비교연산자는 크게 대소비교와 단순비교로 나뉩니다. 
		// 단순비교는 ==, !=이며 모든 자료형간 비교가 가능합니다.
		// 대소비교는 >, <, >=, <= 이며 
		// 숫자끼리만 비교가 가능합니다.
		// 컴퓨터는 비교연산자를 명제로 인식하며
		// 참(true) 거짓(false)를 판단해 결과로 보여줍니다.
		System.out.println(3 > 5);
		System.out.println('a' <= 12);
		// 'a' 아스키 코드 전환되어 비교 가능, but "" 안에 들어있는 경우 아스키 코드 변환 불가.
		System.out.println("a" != "b");
		System.out.println("a" == "a");
		System.out.println(5 == 5.0);

	}

}
