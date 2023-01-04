package day10.javabasics;
//multilevel inheritance
	//parent class
	class fourwheeler {
		fourwheeler(){
			System.out.println("I'm 4 wheel constructor");
		}
		public void wheels() {
			System.out.println("I have 4 wheels");
		}
	}
	//child class of fourwheeler and parent of maruti
	class car extends fourwheeler {
		car(){
			System.out.println("I'm car class constructor");
		}
		public void type() {
			System.out.println("I'm a car");
		}
	}
	
	//child class of car class
	class maruti extends car {
		maruti(){
			System.out.println("I'm maruti class constructor");
		}
		
	
		public void company() {
			System.out.println("I'm maruti");
		}
	}
	public class Inheritance3 {
		public static void main(String[] args) {
			maruti fr = new maruti(); // object of child class
			fr.wheels();
			fr.type();
			fr.company();
		}
	}
	


