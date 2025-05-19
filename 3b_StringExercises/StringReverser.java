*/Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package program3B3;

public class StringReverser{
	
	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String original = "AIET";
	        String reversed = reverseString(original);
	        System.out.println("Reversed string: " + reversed);
	    }
	}

