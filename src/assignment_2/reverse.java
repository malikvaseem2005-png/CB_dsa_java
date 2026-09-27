package assignment_2;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long rev = 0;
        
        while (n > 0) {
            long rem = n % 10;     // Extract the last digit
            rev = rev * 10 + rem;  // Append digit to reversed number
            n = n / 10;            // Remove the last digit
        }
        
        System.out.println(rev);
        
        sc.close();
		// TODO Auto-generated method stub

	}

}
