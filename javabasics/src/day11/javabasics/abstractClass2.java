package day11.javabasics;


	abstract class Shape {
		abstract void draw();
	}
	// In real scenario, implementation is provided by others i.e. unknown by end user
	class Rectangle extends Shape {
		protected void draw() {
			System.out.println("drawing rectangle");
		}
	}
	class Circle1 extends Shape {
		public void draw() {
			System.out.println("drawing circle");
		}
	}
	// In real scenario, method is called by programmer or user
	class abstractClass2 {
		public static void main(String args[]) {
			Shape s = new Circle1(); //create circle object n reference to shape
			s.draw();	// it will call circle class draw
			Shape s1 = new Rectangle();
			s1.draw(); // it will call rectangle class draw
		}
	}

