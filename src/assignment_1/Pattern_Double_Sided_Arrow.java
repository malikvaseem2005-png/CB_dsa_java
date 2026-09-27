package assignment_1;
import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int mid = (n / 2) + 1;

        while (row <= n) {
            // 1. Calculate distance from the middle row
            int d = row <= mid ? (mid - row) : (row - mid);

            // 2. Print leading spaces (using tabs for clean alignment)
            int csp = 1;
            while (csp <= d) {
                System.out.print("  ");
                csp++;
            }

            // 3. Print numbers and hollow space
            int val = mid - d; // Maximum value for the current row

            if (row == 1 || row == n) {
                // First and last row only have '1'
                System.out.print("1");
            } else {
                // Left descending part: from 'val' down to 1
                int c = val;
                while (c >= 1) {
                    System.out.print(c + " ");
                    c--;
                }

                // Middle hollow spaces
                int nsp = 2 * val - 3;
                int cin = 1;
                while (cin <= nsp) {
                    System.out.print(" ");
                    cin++;
                }

                // Right ascending part: from 1 up to 'val'
                c = 1;
                while (c <= val) {
                    System.out.print(c);
                    if (c < val) {
                        System.out.print("  ");
                    }
                    c++;
                }
            }

            row++;
            System.out.println();
        }
		// TODO Auto-generated method stub

	}

}
