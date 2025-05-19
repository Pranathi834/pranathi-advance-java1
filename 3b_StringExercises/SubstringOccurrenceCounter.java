*/Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() */
package program3B2;

public class SubstringOccurrenceCounter {
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String main = "AIET is AIET and AIET is great.";
	        String sub = "AIET";

	        int result = countOccurrences(main, sub);
	        System.out.println("Occurrences of '" + sub + "': " + result);
	    }
	}


