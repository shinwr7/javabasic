
public class Bonus {
	public static void main(String[] args) {
		
		
		int total=0;
		int dec ;
		int a = 1;
		System.out.print(a + " ");
		for(;a<=5;a++) {
			
			for(dec=5;dec>0;dec--) {
				total +=dec;
				if (total>14) {
					break;				}
					
				System.out.print(total+a + " ");
				
			}
		}
		System.out.println();
		total = 0;
		int b = 2;
		System.out.print(b + " ");
		for (;b<4;b++) {
			for (dec=5;dec>0;dec--) {
				total +=dec;
				if (total>13) {
					break;
				}
				System.out.print(total+b + " ");
			}
			
		}
	}}

