
public class Casting {

	public static void main(String[] args) {
		//서로 다른 자료형 간에는 원래 연산이 불가능합니다.
		//그렇지만 편의상 컴퓨터가 자동으로 자료형을
		//보정해주는 경우가 있는데 이것을 자료형 변환이라 합니다. 
		//자동 형 변환인 promotion과 
		//강제 형 변환인 casting이 있습니다.
		//자동 형 변환은 작은범위를 큰 범위에 맞출 때 발생하고
		//강제 형 변환은 큰 데이터를 작은 범위에 맞출 때 사용합니다.
		int a =5;
		double b= 7.12;
		System.out.println(a + b);
		// (자동)int -> double , 정답 : 12.120000000000001 이 나오는데, 이진법으로 표현할 수 있는 12.12의 가장 가까운 값임 .
		System.out.println(a+(int)b);
		//(강제)double -> int 
		byte c = (byte) 851231242L;
		System.out.println(c);
	}

}
