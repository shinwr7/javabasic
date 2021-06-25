
public class Method3 {
	public static void plus(int a, int b) {
		// 내부 실행문에서 두개 이상의 변수를 요구한다면
		// 두개 이상의 매개변수를 선언할 수 있습니다.
		// 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		plus(3, 3);
		// 숫자 하나만 적어넣으면, int a 자리에만 숫자가 들어가고 b 자리가 비어서 에러남.
		// 같은 숫자라도 매개변수자리만큼 넣어줘야함.
		
	}
}
