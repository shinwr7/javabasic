package constructor;

public class House {
	
	public String location;
	public int size;
	public String owner;
	
	public House(String l, int s, String o) {
		location = l;
		size = s;
		owner = o;	
		System.out.println("집 정보");
		
	}
	public void getInfo() {
		System.out.println("위치 : "+ location);
		System.out.println("평수 : "+ size);
		System.out.println("소유주 : "+ owner);
		
	}

}
