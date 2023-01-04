package Assignments.javabasics;

public class Assig1 {

	public static void main(String[] args) {
		
		add(10,20);
		System.out.println("multiplication of 2 no is= "+multiply(4.5f,6.1f));
	}
	   static void add(int a,int b) 
	   {
		   int res=a+b;
		   System.out.println("addition program");
		   System.out.println("value of 1stno is:"+a);
		   System.out.println("value of 2nd no is:"+b);
		   System.out.println("result of 2no is"+res);
	   }
		public static float multiply(float a, float b) {
			
			float res=a*b;
			System.out.println("\nmultipication of floating nos program");
			System.out.println("value of 1st no is"+a);
			System.out.println("value of 1st no is"+b);
			return res;
		}
		
		}
		
		
		
		
		
		
		
		
		
		

	


