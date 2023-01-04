package Assignments.javabasics;

public class assig2 {

	public static void main(String[] args) {
		
        convertascii('a');
       assig2 .convertascii('b');
	}
	public static void convertascii(char ch) {
		System.out.println("program for find Ascii value of char");
        int ascii=ch;
        System.out.println(" Ascii value of char "+ch+"\tis:\t" +ascii);
        System.out.println("**********************************");
        swap(10,20);
        System.out.println("**********************************");
        QuotientRemainder(8,2);
        }
	public static void swap(int num1, int num2)
	{  //int temp=num1;
	  // num1=num2;
	   //num2=temp;
	   System.out.println("befor swap no1 is"+num1);
	   System.out.println("befor swap no2 is"+num2);
	   int temp=num1;
	   num1=num2;
	   num2=temp;
	   System.out.println("**********************************");
	   System.out.println("after swap no1 is"+num1);
	   System.out.println("after swap no1 is"+num2);
	   System.out.println("*********************************");
	}
	public static void QuotientRemainder(int dividend ,int divisor)
	{
	 double quotient= dividend/divisor;
	 double remainder= dividend %divisor;
	 System.out.println("quotient is="+quotient);
	 System.out.println("remainder is="+remainder);	
	}
	}


