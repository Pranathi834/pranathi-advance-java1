package program3B3;

public class program3B3 {
	
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

