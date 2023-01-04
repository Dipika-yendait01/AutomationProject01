package ArrayAssignment.javabasics;
//program to print largest and smallest element in array

public class Assi9n10 {
	public static void main(String args[]) {
	 //Initialize array       0   1  2   3   4
    int [] arr = new int [] {35, 11, 8, 85, 52};  
    //Initialize max with first element of array.  
    int max = arr[0];  
    int min=  arr[0];
    //Loop through the array  
    for (int i = 1; i < arr.length; i++) {  
        //Compare elements of array with max  
       if(arr[i] > max)  
           max = arr[i];  
    }  
    System.out.println("Largest element present in given array: " + max); 
    for (int i = 1; i < arr.length; i++) {  
        //Compare elements of array with max  
       if(arr[i] < min)  
           min = arr[i];  
    }  
    System.out.println("Smallest element present in given array: " + min);  
}  
}  


