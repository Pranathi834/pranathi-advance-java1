/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate() */
package program3C7;

public class StringTruncator{
	
	    public static String truncate(String str, int length) {
	        if (str == null || length < 0) return "";
	        return (str.length() > length) ? str.substring(0, length).concat("...") : str;
	    }

	    public static void main(String[] args) {
	        String input = "Welcome to Java World!";
	        int maxLength = 12;
	        System.out.println("Original: " + input);
	        System.out.println("Truncated: " + truncate(input, maxLength));
	    }
	}


