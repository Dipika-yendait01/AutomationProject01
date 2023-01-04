package day13.javabasics;


	class Sample1
	{
		double x=10;
	    double test1()
	    {
	        System.out.println("Running test1");
	        return 4;// int to double implicit widening
	    }     
	}
	public class PrimitiveCasting6 {
	    public static void main(String[] args) {
	        System.out.println("Program starts");
	        Sample1 s=new Sample1();
	        int res=(int)s.test1();// explicit narrowing (double to int conversion)
	        System.out.println("raturn value="+res);
	        System.out.println("Program ends");
	    }
	}


