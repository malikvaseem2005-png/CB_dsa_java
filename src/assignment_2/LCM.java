package assignment_2;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i =2;
		int lcm = 1;
		while(true) {
			if(n/i==0 && m/i == 0) {
				break;
			}
			if(n%i==0 || m%i==0) {
				if(n%i==0) {
					n/=i;
				}
				if(m%i==0) {
					m/=i;
				}
				lcm*=i;
				continue;
			}
			i++;
		}
		System.out.println(lcm);
		// TODO Auto-generated method stub

	}

}
