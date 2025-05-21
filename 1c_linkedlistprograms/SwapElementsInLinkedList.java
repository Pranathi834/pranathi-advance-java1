/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package program1C5;
import java.util.LinkedList;
import java.util.Collections;
public class SwapElementsInLinkedList {

	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some elements
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");

	        // Display before swapping
	        System.out.println("Before swapping: " + colors);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);

	        // Display after swapping
	        System.out.println("After swapping first and third elements: " + colors);
	    }
	}


