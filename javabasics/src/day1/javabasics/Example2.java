package day1.javabasics;

public class Example2 {
	static int empid=1001;
	double salary;
	public static void main(String[] args) {
		int a=30 ,b=20,c;
		c=a+b;
		System.out.println("program start");
		
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("addition of 2 no. is="+c);
		System.out.println("empid is"+empid);
		System.out.println("empid is"+Example2.empid);
		empid=20;
		System.out.println("empid is"+empid);
		System.out.println("empid is"+Example2.empid);
        Example2 a1= new Example2();
		System.out.println("empid is"+ Example2.empid);
		
		a1.salary=50000;
		System.out.println("empid is"+a1.salary);
		
		Example2 b1= new Example2();
		System.out.println("empid is"+b1.salary);
	
		System.out.println("Program ends");
		 

	}

}
