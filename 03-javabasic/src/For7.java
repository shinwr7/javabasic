
public class For7 {
	public static void main(String[] args) {
		//피라미드형 별을 찍어보겠습니다.
		//아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요. 
		//*
		//**
		//***
		//****
		//중첩반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		
		for (int a=0;a<4;a++) {
//			for(int space=3-a;space>0;space--) {
//				System.out.print(" ");
			
			for(int star=4-a;star>0;star--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
