package practice;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int arr1 [] = new int [6];
		for(int a : arr1) {
			a=r.nextInt(44);
			System.out.print(a+1+" ");
		}
		
		}
	}
	

