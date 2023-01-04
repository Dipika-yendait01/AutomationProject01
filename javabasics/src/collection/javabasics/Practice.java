package collection.javabasics;

import java.util.ArrayList;

public class Practice {
	public static void main(String args[]) {
		ArrayList l1=new ArrayList();
		l1.add("dipika");
		l1.add("priya");
		l1.add("jaya");
		l1.add("vinita");
		System.out.println("arraylist element size:"+l1.size());
		l1.add(1, "1234");
		l1.add(2, null);
		l1.add("jaya");
		System.out.println("arraylist element are:"+l1);
		l1.clear();
		System.out.println("arraylist element are:"+l1);
	}

}
