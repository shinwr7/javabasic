package interface1;

public class Tank implements Vehicle{
	
	private String name;
	private int cannonBall;
	private int speed;
	private int gas;
	
	public Tank (String name) {
		
		this.name=name;
		this.cannonBall=10;
		this.speed=0;
		this.gas=TANK_MAX_GAS;
	}

	@Override
	public void accel() {
		if(speed+10>100) {
			speed=100;
			System.out.println("최대속도");
			return;
		}
		if(gas-5<0) {
			gas=0;
			System.out.println("연료 부족");
			return;
		}
		speed+=10;
		gas-=5;
		
		
	}

	@Override
	public void breakSpeed() {
		if(speed-10<0) {
			speed=0;
			System.out.println("탱크 멈춤");
			return;
		}
		speed-=10;
		
	}

	@Override
	public void reFuel() {
		if(gas+30>TANK_MAX_GAS) {
			gas=TANK_MAX_GAS;
			System.out.println("연료 만땅");
			return;
		}
			gas+=30;
		
	}
	
	public void cannonFire() {
		if(gas-10<0) {
			gas=0;
			System.out.println("연료 부족으로 포탄 발사 실패");
			return;
		}
		if(cannonBall-1<0) {
			cannonBall=0;
			System.out.println("포탄 부족으로 발사 실패");
			return;
		}
		gas-=10;
		cannonBall-=1;
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : "+speed);
		System.out.println("현재 연료 : "+gas);
		System.out.println("소유주 명 : "+name);
		System.out.println("포탄 수 : "+cannonBall);
		System.out.println("---------------");
		
	}
	
}
