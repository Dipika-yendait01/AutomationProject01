package day9.javabasics;
	class B{
		static int age;
		float salary;
		final int empid=100;
		static {       // blocks - static & nonstatic
			int age=20;
			System.out.println("i m sataic block 2 of class B ");	
			System.out.println("value of age="+age);
			System.out.println("*********************************** ");	
		}
		{
			System.out.println("i m non-sataic block 1 of class ");	
		}
		void display(int age,float salary)
		{   
			//this.salary=50;
			System.out.println("i m non static method display ");
			System.out.println("value of age="+age);
			System.out.println("value of empid="+empid);
			System.out.println("value of salary="+salary);	
			System.out.println("value of salary="+this.salary);	
			this.salary=salary;
			System.out.println("value of salary="+salary);	
			System.out.println("*********************************** ");	
		}
}
       class A{
    	   int mobileno=12;
    	   static int mobileno1;
			A(){     //constructor with overloading and using this() to call another constructor
			this(20);
			//mobileno=917568455;
			
		 System.out.println("i m zero parameterised constructor ");	
			}
		    A(int a){
		    	this(15.20,80);
		 System.out.println("i m int parameterized constructor");	   	
		    }
		    A(double b, int age){
		 System.out.println("i m int n double parameterised constructor ");	
		    }
		  void print() {
		     System.out.println("value of mobileno is="+mobileno);	
			 System.out.println("value of mobileno1 is="+mobileno1);	
		    	}
       }
	public class TotalRecall {
		static {
			System.out.println("i m sataic block 1 of class TotalRecall ");	
	  }
		public static void main(String args[]) {
			System.out.println("program start");	
			B a1= new B();
			a1.display(10,25000);
			A a2=new A();
			 System.out.println("value of mobileno1 is="+a2.mobileno);
			a2.print();
		}
}
       
	
       

