package ArrayAssignment.javabasics;
import java.util.Arrays;
//program to copy all elements of one array into another array

public class Assi1 {
   public static void main(String args[]) {
	  int arr []= {10,20,30,40,50};
	  System.out.println("element of original array=");
	  for(int a:arr) {
		 System.out.println(a+"");
	  }
	  System.out.println("************after copying************");
	  int copyarr1 []=Arrays.copyOf(arr, 5);
	  System.out.println("element of new array =");
	  for(int b:copyarr1) {
		 System.out.println(b+"");
		  
	  }
	   }
}
