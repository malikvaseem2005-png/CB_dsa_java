package assignment_2;
import java.util.*;

public class count_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int count = 0;
		while(n>0) {
			int rem = n%10;
			if(rem == digit) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
