package day10.javabasics;

	class testing10{
		testing10(){
			super();}
			//default constructor with super statement
		
		void callingFromVoda() {
			System.out.println("Vodaphone network busy");
		}
	}
	class testing20 extends testing10{
		testing20(){
			super();
		}
		void callingFromIdea() {
			System.out.println("Get Idea sirji");
		}
	}
	class testing30 extends testing20{
		testing30()
		{
			super();
		}
		void callingFromAirtel() {
			System.out.println("try evrything");
		}
	}
	public class Example1 extends testing30 {
		Example1(){
			super();
		}
		void callingMe() {
			System.out.println("I am calling....");
		}
		public static void main(String[] args) {
			Example1 e1=new Example1();
			e1.callingMe();
			e1.callingFromAirtel();
			e1.callingFromIdea();
			e1.callingFromVoda();
			
//			testing1 t1=new testing1();
//			t1.callingFromVoda();
//			testing2 t2=new testing2();
//			t2.callingFromIdea();
//			testing3 t3=new testing3();
//			t3.callingFromAirtel();
		}
	}



