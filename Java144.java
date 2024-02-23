package javaq;

import java.util.ArrayList;
import java.util.List;

public class Java144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> prime = new ArrayList<>();
	    prime.add(2);
	    prime.add(3);
	    prime.add(5);
	    System.out.println("First List: " + prime);

	    // create second list
	    List<Integer> even = new ArrayList<>();
	    even.add(4);
	    even.add(6);
	    System.out.println("Second List: " + even);

	    // create merged list
	    List<Integer> numbers = new ArrayList<>();
	    numbers.addAll(prime);
	    numbers.addAll(even);

	    System.out.println("Merged List: " + numbers);

	}

}
