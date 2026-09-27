package assignment_1;
import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int spaces = 0;
        int val = n;
        int totalRows = 2 * n + 1;

        while (row <= totalRows) {
            // 1. Print leading spaces for alignment
            int csp = 1;
            while (csp <= spaces) {
                System.out.print(" "); // double space for proper width
                csp++;
            }

            // 2. Print descending numbers (from val down to 0)
            int c = val;
            while (c >= 0) {
                System.out.print(c + " ");
                c--;
            }

            // 3. Print ascending numbers (from 1 up to val)
            c = 1;
            while (c <= val) {
                System.out.print(c);
                if (c < val) {
                    System.out.print(" ");
                }
                c++;
            }

            // Update spaces and values for top and bottom halves
            if (row <= n) {
                spaces += 2; // increase spaces as we go down to the middle
                val--;       // decrease the peak number
            } else {
                spaces -= 2; // decrease spaces as we move past the middle
                val++;       // increase the peak number back up
            }

            row++;
            System.out.println();
        }
	}
}
