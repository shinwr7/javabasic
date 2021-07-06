package stringbuilder1;

public class Builder1 {
	public static void main(String[] args) {
		// StringBuilder는 String 클래스와의 로직차이로 인해
		// 속도 개선이 되었습니다. 일부 기능은 String의 기능과 겹칩니다.
		
		StringBuilder a = new StringBuilder("abefg");
		
		//2번 이후의 모든 자료를 다 1칸씩 뒤로 밀고 확보된 공간에 "cd" 입력
		a.insert(2, "cd");
		// StringBuilder 같은 경우 메서드를 통해 리턴받은 변동값을 자동으로 변수에 대입해줌.
		// 그렇기에 a= a.insert(2, "cd"); 형식과 같은 대입식 필요없이 
		// a를 프린트 하면 변동값이 출력됌.
		System.out.println(a);
	}
}
