package assignment_2;
import java.util.*;

public class nthfebunacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// Calling the method to calculate and print the Nth Fibonacci number
		printNthFibonacci(n);
		
		
	}

	public static void printNthFibonacci(int n) {
		if (n == 0) {
			System.out.println(0);
			return;
		}

		int a = 0; // 0th Fibonacci number
		int b = 1; // 1st Fibonacci number[cite: 8]
		int count = 1;

		while (count <= n) {
			int c = a + b; // Next Fibonacci number
			a = b;
			b = c;
			count++;
		}

		// After the loop, 'a' holds the Nth Fibonacci number
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
