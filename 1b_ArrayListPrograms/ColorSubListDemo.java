/*1B4 Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package progrm1B4;
import java.util.ArrayList;
import java.util.List;
public class ColorSubListDemo {
	
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add color names to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list of colors
	        System.out.println("Original Color List: " + colors);

	        // Extract the 1st and 2nd elements (index 0 and 1)
	        List<String> subColors = colors.subList(0, 2);

	        // Display the extracted sublist
	        System.out.println("Extracted Colors (1st and 2nd): " + subColors);
	    }
	}


