/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package program3C9;
import java.util.Random;
public class RandomStringGenerator{
	

	    public static String generateRandomString(int length) {
	        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
	        Random rand = new Random();
	        StringBuilder sb = new StringBuilder();

	        while (length-- > 0) {
	            sb.append(chars.charAt(rand.nextInt(chars.length())));
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        int length = 10;
	        System.out.println("Generated Random String: " + generateRandomString(length));
	    }
	}


