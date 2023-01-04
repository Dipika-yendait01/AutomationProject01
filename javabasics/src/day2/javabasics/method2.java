package day2.javabasics;

public class method2 {
	
	static double salary=30000.5;
	static int empid=1001;
	
	public static int getempid() {
		System.out.println("printempid is running......");
		return empid;
	}
	public static void getempsal() {
		System.out.println("printempsal is running =" +salary);
	}
	public static void main(String[] args)
	{
		System.out.println("program start");
		getempid();//method body gets executed but you won't get its return value in the console as its stored on method or
		getempsal();//System.out.println(getempsal());// compile time error as void method won't return any value to JVM
		System.out.println("********************************");
		System.out.println(getempid());//method body gets executed and also print its return value in the console
		System.out.println("********************************");
		getempsal();
		System.out.println("********************************");
		int res= getempid();//method body gets executed and its return value will be stored in variable for future use
		System.out.println(res);
		int sum=res+1000;
		System.out.println("********************************");
		System.out.println("final result is"+sum);
		System.out.println("progra ends");
		
	}   

}
