package interface1;

public class Airplane implements Vehicle{
	private int speed;
	private int gas;
	private int height;
	private String name;
	
	
	public Airplane (String name) {
		this.name=name;
		this.speed=0;
		this.gas=AIRPLANE_MAX_GAS;
		this.height=0;
		
	}


	@Override
	public void accel() {
		if(speed+50>300) {
			speed=300;
			System.out.println("최대속도");
			return;
		}
		if(gas-80<0) {
			gas=0;
			System.out.println("연료 부족");
			return;
		}
		speed+=50;
		gas-=80;
		
	}


	@Override
	public void breakSpeed() {
		
		if(speed-10<0) {
			speed=0;
			System.out.println("비행기 멈춤");
			return;
		}
		speed-=10;
		
	}


	@Override
	public void reFuel() {
		if(gas+100>AIRPLANE_MAX_GAS) {
			gas=AIRPLANE_MAX_GAS;
			System.out.println("연료 만땅");
			return;
		}
			gas+=100;
		
	}

	public void upHeight () {
		if(gas-80<0) {
			gas=0;
			System.out.println("연료 부족");
			return;
		}
		if(height+50>300) {
			height=300;
			System.out.println("최대 고도");
			return;
		}
		gas-=80;
		height+=50;
	}
	public void downHeight() {
		
		if(height-50<0) {
			height=0;
			System.out.println("이미 착륙완료");
			return;
		}
		
		height-=50;
		if(height<=0) {
			System.out.println("착륙 완료");
		}
	}
	

	@Override
	public void showStatus() {
		
		System.out.println("현재 속도 : "+speed);
		System.out.println("현재 연료 : "+gas);
		System.out.println("소유주 명 : "+name);
		System.out.println("현재 고도 : "+height);
		System.out.println("---------------");
		
		
	}
	
	
	
	
}
