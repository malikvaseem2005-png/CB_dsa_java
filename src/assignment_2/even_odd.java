package assignment_2;
import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odSum = 0;
		int evSum = 0;
		int c = 1;
		while(n>0) {
			int digit = n%10;
			if(c%2==0) {
				evSum+=digit;
			}else {
				odSum+=digit;
			}
			c++;
			n/=10;
		}
		System.out.println(odSum);
		System.out.println(evSum);
		// TODO Auto-generated method stub

	}

}
