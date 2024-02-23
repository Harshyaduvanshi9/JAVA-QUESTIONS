package javaq;

import java.util.LinkedList;

public class Java138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> animals = new LinkedList<>();

		    // Add elements to LinkedList
		    animals.add("Dog");
		    animals.addFirst("Cat");
		    animals.addLast("Horse");
		    System.out.println("LinkedList: " + animals);

		    // access middle element
		    String middle = animals.get(animals.size()/2);
		    System.out.println("Middle Element: " + middle);

	}

}
