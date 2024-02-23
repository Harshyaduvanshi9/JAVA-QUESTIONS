package javaq;

import java.util.LinkedList;
import java.util.Queue;

public class Java137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> numbers = new LinkedList<>();

	    // enqueue
	    // insert element at the rear of the queue
	    numbers.offer(1);
	    numbers.offer(2);
	    numbers.offer(3);
	    System.out.println("Queue: " + numbers);

	    // dequeue
	    // delete element from the front of the queue
	    int removedNumber = numbers.poll();
	    System.out.println("Removed Element: " + removedNumber);

	    System.out.println("Queue after deletion: " + numbers);

	}

}
