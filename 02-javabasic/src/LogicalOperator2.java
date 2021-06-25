
public class LogicalOperator2 {
	public static void main(String[] args) {
		// && , || 는 short circuit(단축검정) 연산자입니다.
		// &, \와 똑같이 작동하되,
		// 왼쪽 조건식만으로 최종 결과가 확정되는 경우
		// 추가 연산을 수행하지 않습니다.
		System.out.println((1+3>4) && (0<3/0)); //0 으로 나눌 경우 에러가 떠야 정상, but 앞에 조건식만을 실행시켜서 에러가 뜨지 않음.
		System.out.println((5>4) || (0<2/0));
	}
}
