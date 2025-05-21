/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package program1C4;
import java.udisplaylinkedlist {

	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> colors = new LinkedList<>();

	        // Add some elements
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Display elements with their positions
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + ": " + colors.get(i));
	        }
	    }
	}


