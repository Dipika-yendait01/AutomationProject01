package Arrays.javabasics;

import java.util.Arrays;

public class Array6 {
	public static void main(String args[]) {
		int[] num1= {5,2,55,80,100,20,3};
		Arrays.
		for(int a:num1) {
			System.out.println(a);
		}
		//sort will sort the elements of array in ascending order and stores in the same array
		Arrays.sort(num1);
		System.out.println("************num1 after sorting***************");
		for(int a:num1) {
			System.out.println(a);
		}
		System.out.println("*************CopyRange array***************");
		int[] num2=Arrays.copyOfRange(num1, 0, 5);
		for(int a:num2){
			System.out.println(a);
		}
	}
}


