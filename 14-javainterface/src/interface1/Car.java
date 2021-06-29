package interface1;

//인터페이스를 구현(상속 아님) 하기 위해서는
//implements(extends 아님) 키워드를 사용
//인터페이스 내부의 추상메서드는 무조건 구현해줘

public class Car implements Vehicle {
	//자동차라면 가져야 하는 변수 설정
	// 현재 속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	public Car (String name) {
		this.name=name;
		this.speed=0;
		this.gas=MAX_GAS;
	}
	
	//생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 100을 자동 대입해줍니다.
	
	@Override
	public void accel() {
		// 한번 가속 시 속도가 10씩 늘어나도록 
		// 연료는 한번 가속시 1씩 소비
		// 속도는 200 초과 불가
		
		if(speed+10>200) {
			speed=200;
			System.out.println("최대속도 도달");
			return;
		}
		if(gas-1<0) {
			gas=0;
			System.out.println("가스 부족");
			return;
		}
		speed+=10;
		gas-=1;
			//가속 전에 가속시 200을 초과 하는지 여부부터 
		
	}

	@Override
	public void breakSpeed() {
		// 한번 감속 시 속도가 10씩 줄어들게 해줘
		// 속도가 0 미만이 될 수 없음.
		if(speed-10<0) {
			speed=0;
			System.out.println("차량 멈춤");
			return;
		}
		speed-=10;
	}

	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채웁니다.
		// 단 연료 최대값은 상수 MAX_GAS를 이용해서 측정해줘.
		if(gas+30>MAX_GAS) {
			gas=MAX_GAS;
			System.out.println("연료 만땅");
			return;
		}
			gas+=30;
		
	}

	@Override
	public void showStatus() {
		System.out.println("차주명 : "+name);
		System.out.println("현재 속도 : "+speed);
		System.out.println("현재 연료 : "+gas);
		System.out.println("---------------");
		
	}
	

}
