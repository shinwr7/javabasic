package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		//식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요. 
		// 메뉴는 5개 이상 집어넣어주세요. 
		// 메뉴를 3개 조회해서 화면에 출력해주세요. 
		
		Map <String, Integer> map = new HashMap<>();
		
		map.put("된장찌개", 6000);
		map.put("김치찌개", 6000);
		map.put("동태찌개", 8000);
		map.put("부대찌개", 7000);
		map.put("순두부찌개", 7000);
		
		System.out.println(map.get("된장찌개"));
		System.out.println(map.get("김치찌개"));
		System.out.println(map.get("동태찌개"));
	
	}
	
}
