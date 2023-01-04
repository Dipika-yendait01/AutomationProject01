package day7.javabasics;

	class Student {
		int rollno;
		float fee;
		Student(int rollno, float fee) {		
			this.rollno = rollno;
			this.fee = fee;
			//System.out.println(rollno + " " +  fee);
			
		}
		 void display() {
			System.out.println(rollno + " " +  fee);//disply method print nsv default value.
		}
	}
	class ThisKeyword1 {
		public static void main(String args[]) {
			Student s1 = new Student(111, 5000f);
			Student s2 = new Student(112, 6000f);
			s1.display();//
			s2.display();//
		}
}
