package javaq;

import java.util.HashSet;
import java.util.Set;

public class Java150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> primeNumbers = new HashSet<>();
	    primeNumbers.add(2);
	    primeNumbers.add(3);
	    System.out.println("Prime Numbers: " + primeNumbers);

	    // create second set
	    Set<Integer> evenNumbers = new HashSet<>();
	    evenNumbers.add(2);
	    evenNumbers.add(4);
	    System.out.println("Even Numbers: " + evenNumbers);

	    // Intersection of two sets
	    evenNumbers.retainAll(primeNumbers);
	    System.out.println("Intersection: " + evenNumbers);

	}

}
