package day2.javabasics;

public class method1 {
	
	static void addtwono(int a, int b)
	{
	     int res=a+b;
	     System.out.println("value of a is="+a);
	     System.out.println("value of b is="+b);
	     System.out.println("value of res is="+res);
	     System.out.println("*******************************");
		// return res;	
		
	}
	
	public static void main(String[]args)
	{
	    
	    addtwono(10,20);
	    method1.addtwono(25, 5);
	}
	
	
	
}
	
	
	
	
	
     /*static void addTwoNum(int a,int b) {//int a=10, int b=20
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		//return;//java complier will write behalf of program
	}
	public static void main(String[] args) 
	{	
		
		addTwoNum(10, 20);
		addTwoNum(100, 200);
		method1.addTwoNum(101, 202);
		method1.addTwoNum(110, 208);
		method1.addTwoNum(210, 205);
	}	
}

*/