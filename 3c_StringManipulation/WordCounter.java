/* Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package program3C10;

public class WordCounter{
	
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "  Java is a high-level language  ";
	        System.out.println("Input: \"" + input + "\"");
	        System.out.println("Word Count: " + countWords(input));
	    }
	}


