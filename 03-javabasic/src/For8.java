
public class For8 {
	public static void main(String[] args) {
		int space;
		int star;
		
		for(int i=0;i<4;i++) {
			for (space=3-i;space>0;space--) {
				System.out.print(" ");
			}
			for (star=0;star<i+1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
