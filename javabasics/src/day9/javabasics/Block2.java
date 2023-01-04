package day9.javabasics;

public class Block2 {
	{
		System.out.println("i m non staticblock3");//non static block
	}
	static{
		System.out.println("i m static block1");//static block1
	}
	
	public static void main(String[] args)
	{
		System.out.println("program start");
		Block2 c1=new Block2();
		System.out.println("Hellow");
	    System.out.println("program ends");
	}

	static{
		System.out.println("i m static block2");//static block2
	}
}
	
	


