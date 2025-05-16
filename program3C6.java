package program3C6;

public class program3C6 {
	    public static String capitalizeWords(String str) {
	        String result = "";
	        boolean capitalizeNext = true;

	        for (char ch : str.toCharArray()) {
	            if (Character.isWhitespace(ch)) {
	                capitalizeNext = true;
	                result += ch;
	            } else if (capitalizeNext) {
	                result += Character.toUpperCase(ch);
	                capitalizeNext = false;
	            } else {
	                result += ch;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String input = "java programming is fun";
	        System.out.println("Original: " + input);
	        System.out.println("Capitalized: " + capitalizeWords(input));
	    }
	}


