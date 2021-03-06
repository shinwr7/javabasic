package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1; // 참조형 변수의 특징! 힙에 있는 데이터의 주소값만 복사해서 대입. -> 얕은 복사
						   // 반대는 깊은 복사! deep copy
		int[] arr3 = {1, 2, 3, 4, 5};
		
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		//주소값이 아닌 전체 배열 데이터를 보고싶다면
		// Arrays.toString(배열); 문법을 사용합니다. 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
	
		
		
	}
}
