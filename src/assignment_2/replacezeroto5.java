package assignment_2;
import java.util.*;

public class replacezeroto5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long mul =1;
		long res = 0;
		while(n>0) {
			long rem = n%10;
			if(rem == 0) {
				rem = 5;
			}
			res+=rem*mul;
			n/=10;
			mul*=10;
		}
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
