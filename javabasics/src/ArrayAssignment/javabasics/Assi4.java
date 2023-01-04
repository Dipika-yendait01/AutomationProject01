package ArrayAssignment.javabasics;
//Program to print duplicate element of array

public class Assi4 {
	public static void main(String args[]) {
		int arr []=new int [] {1,2,5,4,2,3,6,7,5,8};
		//System.out.println("length of array :"+arr.length);
		System.out.println("Dublicate element of array :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
					System.out.println(arr[j])	;
			}
		}
	}
		
}
	
	
	


