package assignment_2;
import java.util.*;
public class Conversionanytoany {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scon = sc.nextInt();
		int dc = sc.nextInt();
		int num = sc.nextInt();
		int sum = 0;
		int sm = 1;
		while(num>0) {
			int rem = num%10;
			sum += rem*sm;
			sm*=scon;
			num/=10;
		}
		if(dc == 10) {
			System.out.println(sum);
			return;
		}
		int dm =1;
		int res = 0;
		while(sum>0) {
			int rem = sum%dc;
			res += rem*dm;
			dm*=10;
			sum /= dc;
		}
		System.out.println(res);
		
	}

}
