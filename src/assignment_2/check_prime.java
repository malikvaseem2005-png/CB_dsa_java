package assignment_2;
import java.util.*;

public class check_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        boolean isPrime = true;
        
        // A prime number has no divisors other than 1 and itself.
        // We only need to check potential divisors up to sqrt(n).
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        
        sc.close();
    
}
		// TODO Auto-generated method stub

	}


