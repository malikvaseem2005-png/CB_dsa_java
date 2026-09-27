package assignment_2;
import java.util.*;

public class simple_input {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// Calling the method to process the input list
		processCumulativeSum(sc);
		
		
	}

	public static void processCumulativeSum(Scanner sc) {
		int sum = 0;

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			sum += n; // Add current number to the cumulative sum

			// If cumulative sum becomes negative, stop processing and break
			if (sum < 0) {
				break;
			}

			// Otherwise, print the number
			System.out.println(n);
		}

		// TODO Auto-generated method stub

	}

}
