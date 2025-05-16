package program1B5;
import java.util.ArrayList;
import java.util.Scanner;

public class program1B5 {

	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some color names
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display the original list
	        System.out.println("Original Color List: " + colors);

	        // Get input from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (0-based) of the element to remove: ");
	        int n = scanner.nextInt();

	        // Check if index is valid
	        if (n >= 0 && n < colors.size()) {
	            // Remove the element at index n
	            String removedColor = colors.remove(n);
	            System.out.println("Removed color: " + removedColor);
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }

	        // Display the updated list
	        System.out.println("Updated Color List: " + colors);

	        scanner.close();
	    }
	}


