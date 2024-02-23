package javaq;

import java.util.LinkedList;

public class java166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> languages = new LinkedList<>();

	    // Add elements to LinkedList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add(0,"sir");
	    System.out.println(languages.get(0));
	    languages.set(0, null);
	    System.out.println("LinkedList: " + languages);

	}

}
