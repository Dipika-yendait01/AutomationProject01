package Arrays.javabasics;

import java.util.Arrays;

public class array7 {
	public static void main(String arg [])
{
	  int[] a= new int [5];  
	  a[0]=10;
	  a[1]=20;
	  a[2]=30;
	  System.out.println("array length is="+a.length);
	  System.out.println("element in 0th postion is="+a[0]);
	  System.out.println("printing all the element in array");
	  for(int i=0;i<a.length;i++) {
		  System.out.println("array elements are="+a[i]);
	  }
	  System.out.println("*************CopyRange array***************");
		//int[] num2=Arrays.copyOfRange(num1, 0, 5);
		//for(int a:num2){
			//System.out.println(a);
	  int num1 []= Arrays.copyOfRange(a, 2, 5);
	    for(int b:num1) {
	    	System.out.println(b);
	    }
	    }
	  
	  }
		



