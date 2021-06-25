package constructor;

public class BasketballPlayer {
	//지역변수
	public int height;
	public int jump;
	public String team;
	public int hp;
	
	public BasketballPlayer(int h, int j, String t, int s) {
							//매개변수
		height =h;
		jump =j;
		team =t;
		hp = s;
		System.out.println("선수 정보");
		System.out.println("키 :"+h);
		System.out.println("점프력 :"+j);
		System.out.println("소속팀 :"+t);
		System.out.println("체력 :"+ s);
		
		}
	public void status() {
		System.out.println("현재 체력 :" + hp);
	}
	public void dunk() {
		hp-=30;
		if(height+jump>=300&&hp>0) {
			
			System.out.println("덩크슛 성공");
			status();
			System.out.println("---------------");
		}
		else if(hp<0){
			System.out.println("선수 탈진");
			System.out.println("---------------");
			
			
			
	}else if(height+jump<300) {
		System.out.println("골대에 닿지 않았습니다");
		status();
		System.out.println("---------------");
		
	}
		
			
			
		}
		
	}
	
	

