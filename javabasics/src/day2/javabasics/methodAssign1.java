package day2.javabasics;

public class methodAssign1 {
       static int age=19; //satic global variable declared n initialised
       float salary=40000; //nsgv declared n initialised

	 /* static and non-static
	 */
	/*
	 * Method for both static and non-static
	 * with and without parameter
	 * with and without return type
	 */

	public static void main(String[] args) 
	{
      System.out.println("sgv="+age);
      methodAssign1 A1 =new methodAssign1();
      System.out.println("nsgv="+A1.salary);
      add();
      System.out.println(add(40,20));
      sub(30,20);
      System.out.println(multiply());
     // methodAssign1 A2=new methodAssign1();
      A1.addtwono();
      System.out.println(A1.addtwono(12,66));
      A1.div(90, 30);
      System.out.println(A1.div());
      }
	
	public static void add()// static method without parameter
	{
		System.out.println("i m addition method");
	}
	public static int add(int a, int b)//static method with parameter
	{
		int res= a+b;
		System.out.println("addition of two no=");
		return res;
		//return (a+b);
	}
	public static void sub(int a,int b)// without return type with param
	{
		int res1=a-b;
		System.out.println("subraction is="+res1);
	}
	public static float multiply() //with return type without parameter
	{
	   float p=10,q=30;
	   float res3=p*q;
	   System.out.println("multiplication is=");
	   return res3;
	}
	private void addtwono() //non static method without return type n param
	{
		System.out.println("hieee i m nonstatic method addtwono");
	}
	public int addtwono(int a, int b) //non static method with return type n param
	{
		System.out.println("add of a and b is=");
		return (a+b);	
	}
	public void div(float a, float b)//NSM without return type with parameter
	{
		float res=a/b;
		System.out.println("division is="+res);	
	}
	public float div() //NSM with return type without param
	{   
		int a=100,b=30;
		System.out.println("division result is=");
		return (a/b);
	}
}
