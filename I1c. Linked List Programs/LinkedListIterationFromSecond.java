package program1C1;
import java.util.Iterator;
import java.util.LinkedList;

public class program1C1 {
	
	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements to the LinkedList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original LinkedList
	        System.out.println("Full LinkedList: " + colors);

	        // Create an iterator starting at the 2nd position (index 1)
	        Iterator<String> iterator = colors.listIterator(1);

	        // Iterate through the list starting from index 1
	        System.out.println("Iterating from 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

