package javaq;

import java.util.Arrays;
import java.util.LinkedList;

public class Java139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] array = {"Java", "Python", "C"};
		    System.out.println("Array: " + Arrays.toString(array));

		    // convert array to a linked list
		    LinkedList<String> languages= new LinkedList<>(Arrays.asList(array));

		    System.out.println("LinkedList: " + languages);

	}

}
