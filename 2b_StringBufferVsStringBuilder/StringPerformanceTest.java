/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/

package program2B;

public class StringPerformanceTest {

	    public static void main(String[] args) {
	        // Number of repetitions
	        int iterations = 10000;

	        // Test with StringBuffer (synchronized)
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append("AIET");
	        }

	        long endBuffer = System.nanoTime();
	        long bufferTime = endBuffer - startBuffer;

	        // Test with StringBuilder (non-synchronized)
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("AIET");
	        }

	        long endBuilder = System.nanoTime();
	        long builderTime = endBuilder - startBuilder;

	        // Display results
	        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
	        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

	        // Justify the better one
	        if (bufferTime > builderTime) {
	            System.out.println("👉 StringBuilder is faster and better for single-threaded operations.");
	        } else {
	            System.out.println("👉 StringBuffer is comparable or better in multi-threaded use, but slower here.");
	        }
	    }
	}

