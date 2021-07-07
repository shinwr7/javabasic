package math1;

import java.util.Random;

public class Math6 {
	public static void main(String[] args) {
		//가위바위보 게임 만들어보겠다
		//Math.random() 을 이용해 1/3 확률로 가위, 바위, 보를 부여받으며
		// 가위>보, 바위> 가위, 보> 가위 상성을 가진다.
		//같은 요소가 나오면 무승부입니다.
		
		
		String [] Rsp = {"가위","바위","보"};

		String player = Rsp[(int)(Math.random()*3)];
		String computer = Rsp[(int)(Math.random()*3)];
		
		
		if(player.equals(computer)) {
			System.out.println("비겼습니다.");
		}
		
		else if(player.equals("가위")) {
System.out.println(computer.equals("보")?"플레이어가 이겼습니다":"컴퓨터가 이겼습니다." );
			
					
		}
		else if(player.equals("바위")) {
System.out.println(computer.equals("가위")?"플레이어가 이겼습니다":"컴퓨터가 이겼습니다." );
			
			
		}
		else if(player.equals("보")) {
System.out.println(computer.equals("바위")?"플레이어가 이겼습니다":"컴퓨터가 이겼습니다." );
			
			
		}
		System.out.println("플레이어 : "+player);
		System.out.println("컴퓨터 : "+computer);
		
		
		//이렇게 해도 되지만, 경우의 수를 더 줄이는 방법은 
		//이겼다, 졌다, 무승부 로 나누는게 더 좋음.
		//그래야 else if 구문을 더적게 씀.
	}
}
