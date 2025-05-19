/*1C3 Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package program1C3;
import java.util.LinkedList;

public class InsertAtEnd {

	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some initial colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Insert "Pink" at the end of the LinkedList
	        colors.offerLast("Pink");

	        // Display the updated list
	        System.out.println("Updated LinkedList after offerLast(\"Pink\"): " + colors);
	    }
	}


