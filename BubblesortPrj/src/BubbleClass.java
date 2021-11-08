

import java.util.Arrays;


public class BubbleClass {
	
	// 버블소트 처리용 메서드를 만들어주세요. 
	
	public static void bubbleSort(int[] arr) {
		
		
		for(int num=0; num<arr.length; num ++) {
			for(int i = 0; i<arr.length-num-1; i++) {
				
				
				if(arr[i]>arr[i+1]) {
					
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					
				}
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] items = {5, 6, 1, 4, 3, 7, 2};
		
		bubbleSort(items);
		
		System.out.println(Arrays.toString(items));
	}
}
