package garbage;

public class Main {
	public static void main(String[] args) {
		
		Item a1 =new Item (1);
		a1=null;
		Item a2 =new Item (2);
		//a2 = null;
		Item a3 =new Item (3);
		System.gc(); //메모리 회수 명령
		Item a4 =new Item (4);
		a4=null; //a4자리에 있는 주소값을 null 처리 해버린다? 
		//-> 힙에 있는 a4 값과의 연결을 끊는것.즉, 힙에 있는 a4 데이터값이 쓸모없어짐.
		Item a5 =new Item (5);
		a5=null;
		System.gc();
		Item a6 =new Item (6);
		
		// 
	}
}
