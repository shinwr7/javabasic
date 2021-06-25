
public class SwitchCase1 {
	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에
		// 제시된 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch(변수) {
		// case 값 1 : 
		// 		실행문 ;
		// case 값 2 :
		// 		......
		// }
		// 와 같이 작성합니다. 
		// 마지막에 default 문을 작성 시 if~else문의 else처럼 
		// 기능합니다.
		
		int a = 3;
		switch(a) {
		case 1 : 
			System.out.println("one");
			break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
		case 2 : 
			System.out.println("two");
			break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
		case 3 :
			System.out.println("three");
			break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
		case 4 :
			System.out.println("four");
			break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
		case 5 : 
			System.out.println("five");
			break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
			default:
				System.out.println("?????");
				break; // case 별로 작성해야 코드가 줄줄이 실행되지 않음
		}
	}
}
