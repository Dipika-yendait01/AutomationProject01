package collection.javabasics;

	import java.util.ArrayList;
	import java.util.List;

	public class Example1 {

		public static void main(String[] args) {
			ArrayList list1=new ArrayList();
					//or
			List ls1=new ArrayList();
			//to add element in list we need to use add()
			ls1.add("Demo1");// auto up casting, String object will be converted into Object class object
			ls1.add(123);//boxing operation --> Integer class object ---> Auto up casting---> Integer class object will be converted into Object class object
			ls1.add("Demo1");
			ls1.add(null);

			System.out.println("List elements are: "+ls1);
			System.out.println("List element count: "+ls1.size());
			System.out.println("Get element present in index 2: "+ls1.get(1));
			//printing ArrayList elements
			for(int i=0;i<ls1.size();i++) {
				System.out.println("Get element present in index "+i+": "+ls1.get(i));
			}
			ls1.add(1, "Pune");
			System.out.println("***********After adding element using index *********");
			for(int i=0;i<ls1.size();i++) {
				System.out.println("Get element present in index "+i+": "+ls1.get(i));
			}
			System.out.println("**********Printing ArrayList Elements using for-each loop*****************");
			for(Object obj:ls1) {
				System.out.println(obj);
				
			}
			List l1=new ArrayList();
			l1.add("Sanjay");
			l1.add("Amar");
			l1.add("Vinay");
			System.out.println("List l1 elements are: "+l1);
			System.out.println("List ls1 elements are: "+ls1);
			System.out.println("**********After adding l1 in ls1********************");
			//ls1.addAll(l1);
			ls1.addAll(2,l1);
			System.out.println("List ls1 elements are: "+ls1);
		}
	


}
