
public class SwitchCase2 {
	public static void main(String[] args) {
		//Math.random(); 을 이용해 난수를 하나 발급받을 수 있고
		//난수의 범위는 0초과 1 미만입니다. 
		// double number = Math.random() ;
		// 뒤에 숫자를 곱하면 원하는 범위를 설정할 수 있습니다.
		// ex) Math.random() * 10; -> 0초과 10 미만
		// int intNum =(int)(Math.random() * 10);
		// -> int로 변환 하였을 때 , 0.01 과 같은 실수는 정수 0으로 바뀜 so, 0이상 10미만의 범위를 갖는다.
		// -> so, case 0 부터 적용 가능
		// System.out.println(intNum);
		
		//Switch~Case문을 이용해서
		//식당 이름을 출력하는
		//프로그램을 만들어보세요.(최소 6개)
		
		int intNum = (int)(Math.random()*6);
		switch(intNum) {
		case 0 : System.out.println("홍콩반점"); // case 0 부터 5까지의 범위로 생각하는게 맞음. 0 1 2 3 4 default 로 가자.
		break;
		case 1 : System.out.println("별천지설농탕");
		break;
		case 2 : System.out.println("여우초밥");
		break;
		case 3 : System.out.println("명동 돈까스");
		break;
		case 4 : System.out.println("홍대 닭한마리");
		break;
			default : 
			System.out.println("마포만두");
			break;
		}
	}
}
