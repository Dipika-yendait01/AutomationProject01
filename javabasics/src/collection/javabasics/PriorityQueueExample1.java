package collection.javabasics;


	import java.util.Iterator;
	import java.util.PriorityQueue;
	import java.util.Queue;
	public class PriorityQueueExample1{
		public static void main(String args[]) {
			Queue queue = new PriorityQueue();
			// while adding element in Queue, it will always keep smallest element on the top
			System.out.println("Size: " + queue.size());
			System.out.println("Eleements of Queue: " + queue);
			// peek() returns top most element of the queue, if the queue if empty dn it
			// will return 'null' instead of throwing exception
			System.out.println("head element of the queue using peek():" + queue.peek());
			 //element() returns top most element of the queue, if the queue if empty dn it
			 //will throw an exception by name 'NoSuchElementException'
			System.out.println("head element of the queue using element():" + queue.element());
			
			
		}
	}
