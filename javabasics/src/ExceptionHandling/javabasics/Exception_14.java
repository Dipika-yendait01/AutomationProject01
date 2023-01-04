package ExceptionHandling.javabasics;

	//Throwing UserDefinedException 
	//class represents user-defined exception  
	class ShaileshExaception extends Exception {
		public ShaileshExaception(String s) {
			// Calling constructor of parent Exception
			super(s);
		}
	}
	//Class that uses above MyException  
	
		public class Exception_14 {
		public static void validateAge(int age) throws ShaileshExaception   {
			if (age < 18) {
				// throw Arithmetic exception if not eligible to vote
				throw new ShaileshExaception("Shailesh Exception says, you are not eligible for voting");
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}
		public static void main(String args[]) throws ShaileshExaception{
			System.out.println("Main method started");
			validateAge(18);
			System.out.println("Rest of the code..");
		}
	}

	/**
	throw ---> is used to throw explicit exception from a method body, it can be checked or unchecked exception
		  ---> if its a checked exception dn you have handle it by using try-catch block or you can declare that exception
		  	   in method label using throws keyword in this case where ever this method gets called in that method you need
		  	   to handle to exception in order to continue the program

	*/


