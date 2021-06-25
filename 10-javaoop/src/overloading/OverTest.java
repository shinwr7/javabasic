package overloading;

public class OverTest {
	
	private String a;
	private int b;
	
	public OverTest() {
		this.a = "0";
		this.b = 1;
	}
	
	public OverTest(String a) {
		this.a=a;
		this.b=2;
	}
	
	public OverTest(int b) {
		this.a = "3";
		this.b=b;
	}
	
	public OverTest(String a, int b) {
		this.a=a;
		this.b=b;
		
	}

	
	public void showData() {
		System.out.println("a의 값 :" +a);
		System.out.println("b의 값:" +b);
	}
}
