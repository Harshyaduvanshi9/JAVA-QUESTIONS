package javaq;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Java153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a hashmap
	    Map<String, String> languages = new HashMap<>();
	    languages.put("pos4", "kk");
	    languages.put("pos3", "JS"); 	
	    languages.put("pos1", "Java");
	    languages.put("pos2", "Python");
	    System.out.println("Map: " + languages);

	    // create a tree map from the map
	    TreeMap<String, String> sortedNumbers = new TreeMap<>(languages);
	    System.out.println("Map with sorted Key" + sortedNumbers);


	}

}
