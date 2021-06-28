package static2;

public class Main {
	public static void main(String[] args) {
		//Asean 조원 없이도 Asean 조별점수는 조회 가능
		
		//System.out.println(Asean.score);
		
		Asean s1 = new Asean (24,23,30) ;
		Asean s2 = new Asean (25,21,30) ;
		Asean s3 = new Asean (24,24,30) ;
		Asean s4 = new Asean (23,23,27) ;
		
		s1.showAseanInfo();
		s2.showAseanInfo();
		s3.showAseanInfo();
		s4.showAseanInfo();
		
		
		
	}
}
