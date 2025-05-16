package program3B5;

public class program3B5 {
	
	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "   Java   Programming   ";
	        String cleaned = removeWhitespace(input);
	        System.out.println("Without whitespace: '" + cleaned + "'");
	    }
	}


