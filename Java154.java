package javaq;

import java.util.ArrayList;

public class Java154 {

	public static void display(ArrayList<String> languages) {

	    System.out.print("ArrayList: ");
	    for(String language : languages) {
	      System.out.print(language + ", ");
	    }
	  }
	  public static void main(String[] args) {

	    // create an arraylist
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");

	    // passing arraylist as function parameter
	    display(languages);
	  }

}
