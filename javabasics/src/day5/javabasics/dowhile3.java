package day5.javabasics;

public class dowhile3 {

	public static void main(String[] args) {
		System.out.println("Printing numbers from 4 to 0");
		for(int i=4;i>=0;i--)
		{
			System.out.println("hellow "+i);
		}
		System.out.println("***************************");
		int i=4;
		while(i>=0)
		{
			System.out.println("hellow "+i);
			i--;
		}
		System.out.println("***************************");
		char c1='a';
		while(c1<='z') 
		{
			System.out.print(c1+" ");
			c1++;
		}
		System.out.println("\n***************************");
		char c2='z';
		while(c2>='a') 
		{
			System.out.print(c2+" ");
			c2--;
		}
		System.out.println("*************************************");
		int num=1;
		while(num<=50) {
		if(num%2==0) 
		{
			System.out.println("no is even "+num);
		}
			num++;
		}
		
	
		}

	}


