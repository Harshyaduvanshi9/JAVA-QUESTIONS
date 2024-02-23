package javaq;

import java.util.ArrayList;

public class Java140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages= new ArrayList<>();

	    // Add elements in the array list
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    System.out.println("ArrayList: " + languages);

	    // convert the arraylist into a string
	    String arraylist = languages.toString();
	    System.out.println("String: " + arraylist);

	}

}
