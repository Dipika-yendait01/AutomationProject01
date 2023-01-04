package day5.javabasics;

public class dowhile1 {
	public static void main(String[] args) {

		int c = 10;
		System.out.println("Printing all the numbers from 10 till 1");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			--c;	
		} while (c > 0);
		
	System.out.println("******alternative using for loop*************");
	
	for(int i=10;i>0;i--)
	{
		System.out.println(i);
	}
	
	System.out.println("******alternative using while loop**************************");
	int i=10;
	while(i>0) 
	{
		System.out.println("value of i is "+i);
		i--;
	}
	System.out.println("*******************************");
	int n=1,times=0;
	do {
		System.out.println("Java do while loops:" + n); //only body gets executed
		n++;
	} while (n <= times);//1<=0
	
	while(n<=times) {
		System.out.println("Java do while loops:" + n); //conditon not true hence body not executed
		n++;
	}
	
	}
	
}
