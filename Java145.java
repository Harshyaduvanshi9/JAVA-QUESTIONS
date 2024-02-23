package javaq;

import java.util.HashMap;

public class Java145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> numbers = new HashMap<>();
	    numbers.put("First", 1);
	    numbers.put("Second", 2);
	    numbers.put("Third", 3);
	    System.out.println("HashMap: " + numbers);

	    // return the value of key Second
	    int value = numbers.get("Second");

	    // update the value
	    value = value * value;

	    // insert the updated value to the HashMap
	    numbers.put("Second", value);
	    System.out.println("HashMap with updated value: " + numbers);

	}

}
