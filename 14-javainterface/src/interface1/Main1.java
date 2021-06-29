package interface1;

public class Main1 {
	public static void main(String[] args) {
		
		Vehicle v1 = new Car ("신우람");
		Car c1 = new Car ("시누람");
		
		v1.accel();
		v1.accel();
		v1.accel();
		
		v1.breakSpeed();
		v1.breakSpeed();
		v1.breakSpeed();
		
		v1.reFuel();
		v1.showStatus();
		
		c1.accel();
		c1.accel();
		c1.accel();
		c1.showStatus();
	}
}
