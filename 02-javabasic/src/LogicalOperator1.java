
public class LogicalOperator1 {

	public static void main(String[] args) {
		//논리연산자는 둘 이상의 논리식을 병렬형태로 제시합니다.
		//논리식1 & 논리식 2의 경우는 양쪽 논리식이 다 true 인경우
		//논리식1 | 논리식2의 경우는 한쪽이상이 true 인 경우
		//최종 조건식을 true로 판단해줍니다.
		System.out.println((100>50) & (30>50));
		System.out.println(100>50 | 30>50);

	}

}
