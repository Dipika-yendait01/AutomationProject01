package day10.javabasics;

//single inheritance
	class fruit {
		fruit(){
			System.out.println("fruit class cons..");//1
		}
		public void taste() {
			System.out.println("Fruits are sweet");//3
		}
	}
	// child class/sub-class of fruit
	class apple extends fruit {
		apple(){
			//super(); //java compiler will write default super()
			System.out.println("Apple class Cons..");//2
		}
		public void shape() {
			System.out.println("Apple is round");//4
		}
	}
	public class Inheritance2 {
		public static void main(String[] args) {
			apple fr = new apple(); // object of child class
			fr.taste(); // call method of parent class
			fr.shape(); // call method of child class
		}
	}

