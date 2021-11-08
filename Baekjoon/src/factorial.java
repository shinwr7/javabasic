import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>=0&&N<=12) {
			System.out.println(factor(N));
		}
		sc.close();
	}
	
	public static int factor (int num) {
		
		if(num==0) {
			
			return 1;
		}
		
		return num*factor(num-1);
		
	}

}
