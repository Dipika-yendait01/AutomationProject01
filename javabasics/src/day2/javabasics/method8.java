package day2.javabasics;

public class method8 {
	 float a=15.56f;//non staic global variable declared n initialised
	 
		public int add(int num1,int num2)//non static method
		{
			return (num1+num2);
		}
		public double sub(int a, int b) {
			return(a-b);
		}
		public static void main(String[] args) {
			
			System.out.println("Program Starts");
			method8 m1=new method8();
			System.out.println("NSGV a: "+m1.a);
			System.out.println("addition of two no is="+m1.add(25, 30));
			System.out.println("subtraction of two no is="+m1.sub(100, 30));
			System.out.println("Program Ends");
		}
	
}
//static variable and static method ----> static member
//nonstatic variable and nonstatic method ----> nonstatic member