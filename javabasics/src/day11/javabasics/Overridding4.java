package day11.javabasics;

	class ABC {
		public void myMethod() {
			System.out.println("method of ABC class");
		}
	}
	class Overridding4 extends ABC {
		public void myMethod() {
			// This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method of Class Overriding4");
		}
		public static void main(String args[]) {
			Overridding4 obj = new Overridding4();
			obj.myMethod();
		}
	}

