
public class variable {

	public static void main(String[] args) {
		// 변수는 기본적으로
		// 자료형 변수명;(선언)
		// 변수명 = 값;(초기화)
		// 방식과
		// 자료형 변수명 = 값; (선언 및 초기화)
		// 두 가지 방식으로 값을 대입할 수 있습니다.
		int a;// 나는 a 박스에 정수를 넣을 예정이다(아직 안넣음)
		a = 5; //위의 a 박스에 5를 집어넣겠다. 
		int b, c; // b, c 박스에 정수를 넣을 예정이다.
		b=10; // b에 10을 담겠다.
		c=15; // c박스에 15를 담겠다.
		System.out.println(a);//a박스 내부값 출력
		System.out.println(b);//b박스 내부값 출력
		System.out.println(c);//c박스 내부값 출력
		a =20; //a 변수 값 20으로 교체(기존의 5 삭제됨)
		System.out.println(a); //변경된 값 출력
		

	}

}
