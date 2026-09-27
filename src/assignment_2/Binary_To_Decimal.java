package assignment_2;
import java.util.*;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// Calling the method to convert and print
		convertToDecimal(n);
		
	}

	public static void convertToDecimal(int n) {
		int ans = 0;
		int multiplier = 1; // Represents powers of 2 (2^0, 2^1, 2^2, ...)
		
		while (n > 0) {
			int rem = n % 10;     // Extract the last digit
			ans = ans + (rem * multiplier); // Add to the answer
			multiplier = multiplier * 2;    // Multiply by 2 for the next power
			n = n / 10;           // Remove the last digit
		}
		
		System.out.println(ans);
	}
		// TODO Auto-generated method stub

	}


