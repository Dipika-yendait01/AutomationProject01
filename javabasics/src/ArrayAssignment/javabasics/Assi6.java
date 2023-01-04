package ArrayAssignment.javabasics;

//program to print element of array in reverse order

public class Assi6 {
   public static void main(String args[]) {
	   int[]arr= {1,2,3,4,5};
	   System.out.println("Original array is:");
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]+"");
	   }
	   System.out.println("array in reverse order is:");
	   for(int i=arr.length-1;i>=0;i--) {
		   System.out.println(arr[i]+"");
	   }
   }
}
