package day7.javabasics;

public class FinalKeyword1 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}

	public static void main(String args[]) {
		FinalKeyword1 obj = new FinalKeyword1();
		obj.run();
		System.out.println(obj.salary);
		//System.out.println(+obj.empID);
	}


}
