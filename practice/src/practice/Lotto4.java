package practice;



public class Lotto4 {
	public static void main(String[] args) {

		int lottoNum [] = new int [45];
		int i=0;
		for(;i<45;i++) {
			lottoNum[i]=i+1;
		}
		 
	
		for(int a=0;a<6;a++) {
			i=(int)(Math.random()*45+1);
			System.out.println(lottoNum[i]);
		}
		
		String test = "test";
		System.out.println(test.charAt(0));
	
	}
		

	}

