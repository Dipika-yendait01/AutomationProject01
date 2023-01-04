package day7.javabasics;

public class FinalKeyword2 {

		final int speedlimit;// blank final variable
		FinalKeyword2() {
			speedlimit = 70; //initialized value of final variable through constructor
			System.out.println(speedlimit);
		}
		public static void main(String args[]) {
			FinalKeyword2 f1=new FinalKeyword2();
			System.out.println(f1.speedlimit); 
		}
	}


