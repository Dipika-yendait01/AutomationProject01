package Arrays.javabasics;

public class completepyramid {
	public static void main(String args[]) {
		int row=5;
		for(int i=0;i<row;i++)
		{
			for(int j=row-1;j>1;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{		
			System.out.print("* ");
		}
		System.out.println(" ");
		
}
		System.out.print("\n\n\n\n ");
}}