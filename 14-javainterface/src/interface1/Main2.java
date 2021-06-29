package interface1;

public class Main2 {
	public static void main(String[] args) {
		
		Vehicle t1 = new Tank ("신우람") ;
		Tank t2 = new Tank ("신우람");
		
		t2.cannonFire();
		t2.cannonFire();
		t2.cannonFire();
		t2.cannonFire();
		t2.cannonFire();
		t2.showStatus();
		
		Vehicle a1 = new Airplane ("신우람");
		Airplane a2 = new Airplane ("신우람");
		
		a2.upHeight();
		a2.upHeight();
		a2.upHeight();
		a2.upHeight();
		a2.showStatus();
	
	}
}
