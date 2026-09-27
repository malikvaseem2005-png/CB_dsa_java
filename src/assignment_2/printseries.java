package assignment_2;
import java.util.*;

public class printseries {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        printSeries(n1, n2);

        
    }
	public static void printSeries(int n1, int n2) {
        int count = 0; // Tracks valid terms printed
        int n = 1;     // Term multiplier starting from 1

        while (count < n1) {
            int term = 3 * n + 2;
            
            // Check if the term is NOT a multiple of N2
            if (term % n2 != 0) {
                System.out.println(term);
                count++; // Increment count only when a valid term is printed
            }
            
            n++; // Move to the next term multiplier
        }
    }

}
