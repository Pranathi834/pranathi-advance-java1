package program3C8;

public class program3C8 {
	
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

