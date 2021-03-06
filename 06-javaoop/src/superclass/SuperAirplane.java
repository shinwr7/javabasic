package superclass;

public class SuperAirplane extends Airplane {
	
	public SuperAirplane(int s) {
		
		super(s); // = Airplane(300) ;
		
	}
	
	public void fly() {
		// 일반 비행(부모클래스의 fly)는 super.fly();
		// 를 이용해서 호출 가능합니다.
		// 속도 900 이하인 경우 일반 비행 모드를 호출하게 해 주시고.
		// 속도가 900이상 1300이하인 경우는 초음속 비행을 
		// 호출하도록 로직을 만들어주세요.
		// 속도 900 이하인 경우 일반 비행 모드 호출
		if(speed + 500 <= 900) {
			super.fly();
		}else {
			// 속도 900 이상 1300 이하인 경우 초음속 비행으로 호출
			if(speed + 500 >= 1300) {
				speed = 1300;
			}else {
				speed += 500;
			}
			System.out.println("초음속 비행 속도 :" + speed + "km/h");
		}
		}
	// 자바 책 = 245~251페이지 참고.
	
}
