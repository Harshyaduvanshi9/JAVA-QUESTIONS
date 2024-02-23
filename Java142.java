package javaq;

import java.util.HashMap;
import java.util.Map.Entry;

public class Java142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<String, String> languages = new HashMap<>();
		    languages.put("Java", "Enterprise");
		    languages.put("Python", "ML/AI");
		    languages.put("JavaScript", "Frontend");
		    System.out.println("HashMap: " + languages);

		    // iterating through key/value mappings
		    System.out.print("Entries: ");
		    for(Entry<String, String> entry: languages.entrySet()) {
		      System.out.print(entry);
		      System.out.print(", ");
		    }

		    // iterating through keys
		    System.out.print("\nKeys: ");
		    for(String key: languages.keySet()) {
		      System.out.print(key);
		      System.out.print(", ");
		    }

		    // iterating through values
		    System.out.print("\nValues: ");
		    for(String value: languages.values()) {
		      System.out.print(value);
		      System.out.print(", ");
		    }

	}

}
