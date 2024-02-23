package javaq;

import java.util.ArrayList;

public class Java141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an array list
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    System.out.println("ArrayList: " + languages);

	        // Using forEach loop
	    System.out.println("Iterating over ArrayList using for-each loop:");
	    for(String language : languages) {
	      System.out.print(language);
	      System.out.print(", ");
	    }

	}

}
