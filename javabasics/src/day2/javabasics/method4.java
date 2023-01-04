package day2.javabasics;

public class method4 {

	
		static double x = 10, y = 20, z = 30; // static variable declare n initialised
        //static double x,y,z;
		public static void main(String[] args) {
			// x=10;
			 //y=20;
			 //z=30;
			System.out.println("Input the first number: " + x);
			System.out.println("Input the second number: " + y);
			System.out.println("Input the third number: " + z);
			System.out.println("Average of 3 number is: " + average());
			System.out.println("Average of 3 number with param is: " + average(10, 25, 75));
			int a = 20, b = 30, c = 45;
			System.out.println("Average of 3 number with param is: " + average(a, b, c));
			System.out.println(addition(10, 25));
			addition(10.5, 25);
			System.out.println(multiply(10,20));
			double d1= div(a,b);
			System.out.println(d1);
			System.out.println(div(a,b));
		}
		public static void addition(double a, double b) {
			System.out.println("addition method with void return type");
			double res = a + b;
			System.out.println("addition of " + a + " and " + b + " : " + res);
		}
		public static double addition(int a, int b) {
			System.out.println("addition method with double return type");
			double res = a + b;
			System.out.println("addition of " + a + " and " + b);
			return res;
		}

		public static double average(int a, int b, int c) // int a=10,int b=25,int c=75;
		// int a=p=55, b=q=58, c=r=82;
		{
			return (a + b + c) / 3;
		}

		public static double average() {
			return (x + y + z) / 3;
		}
		public static int multiply(int a,int b) // Multiplication of two numbers
		{
			int res=a*b;
			System.out.println("multipication of two no is");			
			return res;
		}
		public static double div(float a, float b)// division of two no.
		{ 
			double res=a/b;
			System.out.println("division of two no is");	
			return res;
		}
	}


