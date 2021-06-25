package structure;

public class LolPlayer {
	
	public String id;
	public String tier;
	public String line;
	public int lev;
	
	public void getInfo() {
		System.out.println("아이디 : "+ id);
		System.out.println("티어 : " + tier);
		System.out.println("주 라인 : "+ line);
		System.out.println("레벨 : " + lev);
	}
	
}
