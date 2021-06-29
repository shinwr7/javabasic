package practice;

public class Lotto3 {
	public static void main(String[] args) {
		int arr1 [] = new int [6];
		for(int a  : arr1) {
			a =(int)(Math.random()*45);
			System.out.println(a);
		}
	}
}
