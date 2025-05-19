/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace() */
package program3B5;

public class WhitespaceRemover{
	
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "   Java   Programming   ";
	        String cleaned = removeWhitespace(input);
	        System.out.println("Without whitespace: '" + cleaned + "'");
	    }
	}


