/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric() */
package program3C8;

public class NumericStringChecker{
	
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "123456";
	        String input2 = "123abc";
	        System.out.println(input + " is numeric? " + isNumeric(input));
	        System.out.println(input2 + " is numeric? " + isNumeric(input2));
	    }
	}

