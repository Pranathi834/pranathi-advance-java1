package program1B2;
import java.util.ArrayList;
public class RemoveColors {
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display original list
	        System.out.println("Original list: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedElement = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedElement);
	        } else {
	            System.out.println("List does not have a 2nd element to remove.");
	        }

	        // Remove color "Blue" by value
	        boolean isBlueRemoved = colors.remove("Blue");
	        if (isBlueRemoved) {
	            System.out.println("Color 'Blue' removed from the list.");
	        } else {
	            System.out.println("Color 'Blue' not found in the list.");
	        }

	        // Display the final list
	        System.out.println("Updated list: " + colors);
	    }
	}


