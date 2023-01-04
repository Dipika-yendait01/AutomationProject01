package day2.javabasics;

public class method3 {
	// static global variables
	static int age=18;
	static double salary=5000;

	public static int test1() {
		System.out.println("I am test1 method.");
		// logic
		 int pin=201201;
		 return pin;
		//return 201201;
	}
    static void test2() {
		System.out.println("I am test2 method");// return; this will be written by java compiler at compile
	}

	static double test3(boolean b1) {
		System.out.println("i m a test 3 method");
		return 15.36;
		}
	
	static private void test4()
	{
		System.out.println("i m test 4 method");
	}

	public static void main(String[] args)
	{
		test2();
		//test4(20.5);
        System.out.println(test1());
        int r1=test1();
        System.out.println(r1);
        System.out.println(test3(false));
        test4();
        System.out.println("age is"+age);
        System.out.println("salary is"+salary);
        int newpin=r1+10;
        System.out.println("final sum is="+newpin);
        
	}

}


