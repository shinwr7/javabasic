import java.util.Scanner;

public class Bonus2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		  //소수 = 1 과 자기 자신으로만 나눌 수 있다 % n 했을 때 0이 2번나와야함
		
		for (int i=4;i<=n;i++) {
			
			int count=0;
			for(int k=1;k<=i;k++) {
				if(i%k==0) {
					count+=1;
					if(count==2) {
						System.out.println(i);
					}
				}
				
					
				}
				
			}
				
					
		}
				}
			
	
					
				
			
					
	
			
		
	

