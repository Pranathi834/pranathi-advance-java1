package program3B4;

public class program3B4 {
	
	    public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String input = "Madan, in Eden, I'm Adam";

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
	    }
	}


