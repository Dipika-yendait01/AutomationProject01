package ExceptionHandling.javabasics;

	//import java.io.FileInputStream;
	//import java.io.FileNotFoundException;

	public class exception17{
		// defining a method
		public int divideNum(int m, int n) //throws ArithmeticException
		{
			int div = m / n;
			return div;
		}

		// main method
		public static void main(String[] args) {
        exception17 obj = new exception17();
			//System.out.println(obj.divideNum(45, 0));
			try {
				System.out.println(obj.divideNum(45, 0));
			} catch (ArithmeticException e) {
				System.out.println("\nNumber cannot be divided by 0");
				e.printStackTrace();
			}
			System.out.println("Rest of the code..");
		}
	}


