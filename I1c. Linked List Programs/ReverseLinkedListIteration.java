/*1C2 Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package program1C2;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
	
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
	        System.out.println("Original LinkedList: " + colors);

	        // Create a descending iterator (reverse order)
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Iterate in reverse order
	        System.out.println("Iterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


