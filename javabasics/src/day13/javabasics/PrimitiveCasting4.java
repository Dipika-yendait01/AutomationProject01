package day13.javabasics;


	public class PrimitiveCasting4 {

		public static void main(String[] args) {
			byte b = 5; //implicit widening
			short s =(short) b;//explicit widening
			int i = b;
			long l = b;
			float f = b;
			double d = b;
			System.out.println("Examples of Widening Type casting...!!");
			System.out.println("byte to short : " + s);
			System.out.println("byte to int : " + i);
			System.out.println("byte to long : " + l);
			System.out.println("byte to float : " + f);
			System.out.println("byte to double : " + d);
		}
	

}
