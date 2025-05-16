package program3A;
import java.util.Scanner;
public class program3A {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1.equals(str3): " + str1.equals(str3));
	        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

	        // 4. String Searching
	        System.out.println("str1 contains 'll': " + str1.contains("ll"));
	        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
	        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

	        // 5. Substring Operations
	        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

	        // 6. String Modification
	        String modifiedStr = str1.replace("l", "z");
	        System.out.println("Modified str1 (replace 'l' with 'z'): " + modifiedStr);

	        // 7. Whitespace Handling
	        String spaced = "   Java Programming   ";
	        System.out.println("Original with spaces: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String concatStr = str1 + " " + str2;
	        System.out.println("Concatenated string: " + concatStr);

	        // 9. String Splitting
	        String csv = "apple,banana,mango,grape";
	        String[] fruits = csv.split(",");
	        System.out.println("Split fruits:");
	        for (String fruit : fruits) {
	            System.out.println("- " + fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Start");
	        sb.append(" -> Middle").append(" -> End");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email
	        System.out.print("Enter an email address to validate: ");
	        String email = scanner.nextLine();

	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          email.startsWith(email.substring(0, email.indexOf("@"))) &&
	                          (email.endsWith(".com") || email.endsWith(".org"));

	        System.out.println("Is the email valid? " + isValid);

	        scanner.close();
	    }
	}


