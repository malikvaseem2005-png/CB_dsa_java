package assignment_2;
import java.util.*;

public class InverseNumber {

	public static void main(String[] args) {
		int n = 43215;
		System.out.println(Inverse_Number(n));

	}

	public static int Inverse_Number(int n) {
		int sum = 0;
		int place = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + place * Math.pow(10, rem - 1));
			n = n / 10;
			place++;
		}
		return sum;
	}

}
		// TODO Auto-generated method stub

	