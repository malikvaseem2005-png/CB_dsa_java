package assignment_2;
import java.util.*;

public class GDC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		// Calling the method to find and print the GCD
		findGCD(n1, n2);
		
		
	}

	public static void findGCD(int n1, int n2) {
		int dividend = n1;
		int divisor = n2;

		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}

		// When the remainder becomes 0, the divisor is the GCD
		System.out.println(divisor);
		// TODO Auto-generated method stub

	}

}
