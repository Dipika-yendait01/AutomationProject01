package polymorphism.javabasics;


	class Vehicle {
		// defining a method
		void run() {
			System.out.println("Vehicle is moving");
		}
	}
	// Creating a child class
	class Car2 extends Vehicle {
		// defining the same method as in the parent class
		void run() {
			System.out.println("car is running safely"); //override
		}
	}
	public class Overriding{
		public static void main(String args[]) {
			Car2 obj = new Car2();// creating object
			obj.run();// V
			
		//	Vehicle b1=new Car2(); //it will give overrided behavior
		//	b1.run();
			
		}
	}

