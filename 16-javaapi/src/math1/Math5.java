package math1;

public class Math5 {
	public static void main(String[] args) {
		
		//주사위 게임을 만들어주세요.
		//주사위게임은 내 값은 myValue 변수에,
		//컴터 값은 comValue변수에 값을 난수발생으로 1~6번위로 부여한 뒤 
		//값이 같다면 무승부, 아니면 나나 컴퓨터 중 승자를 알려주는 방식입니다.
		
		int myValue = (int)(Math.random()*6)+1;
		int comValue =(int)(Math.random()*6)+1;
		
		
		if(myValue==comValue) {
			System.out.println("무승부");
			
		}
		else if (myValue>comValue) {
			System.out.println("플레이어 승");
			
		}
		else {
			System.out.println("컴퓨터 승");
			
		}
		System.out.println("플레이어 값 :"+ myValue);
		System.out.println("컴퓨터 값 :"+ comValue);
	}
}
