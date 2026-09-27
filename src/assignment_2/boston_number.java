package assignment_2;
import java.util.*;

public class boston_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int fsum =0;
		int dsum = 0;
		 for (int i = 2; i <= num; i++) {
	            while (num % i == 0) {
	                fsum += i;
	                num /= i;
	            }
	        }

		while(n>0) {
			int rem = n%10;
			dsum+=rem;
			n/=10;
		}
		if(fsum==dsum) {
			System.out.println(1);
		}else {
			System.out.println(0);
		// TODO Auto-generated method stub

	}

}
}
