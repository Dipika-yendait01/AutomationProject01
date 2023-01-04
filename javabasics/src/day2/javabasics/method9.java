package day2.javabasics;
class Call{
	public static void main(String[] args) {
		System.out.println("Hello, I am call class....");
		
	}
}
public class method9 {

	double x = 10, y = 20, z = 30;// non static global variable
	boolean checkSameOrNot(int a,int b) {
		
		return (a==b);
	}
	static void display() {
		method9 m2 = new method9();
		System.out.println("Input the first number: " + m2.x);
		System.out.println("Input the second number: " + m2.y);
		System.out.println("Input the third number: " + m2.z);
	}
	public static void main(String[] args) {
		System.out.println("I am method9 class.........");
		method9 m1 = new method9();
		System.out.println("Input the first number: " + m1.x);
		System.out.println("Input the second number: " + m1.y);
		System.out.println("Input the third number: " + m1.z);
		System.out.println("avarage is:="+m1.average(m1.x,m1.y,m1.z));
				//or
		//m1.average(10, 20, 30);
		boolean res=m1.checkSameOrNot(10,10);
		System.out.println(res);
		System.out.println(m1.checkSameOrNot(10,20));
		
		display();
	}
	public double average(double p, double q, double r) //p=10,q=20,r=30
													  //p=m1.x=10,q=m1.y=20,r=m1.z=30
	{
		return (p + q + r) / 3;
		//System.out.println("The average value is " + res);
	}
}

	