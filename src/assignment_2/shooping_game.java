package assignment_2;
import java.util.Scanner;

public class shooping_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int m = sc.nextInt();
		int n = sc.nextInt();
		Shoping(m, n);
		t--;
		}

	}

	public static void Shoping(int m, int n) {
		int h = 0;
		int a = 0;
		int phone = 1;
		while(true) {
			a = a+phone;
			if(a>m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h = h+phone;
			if(h>n) {
				System.out.println("Aayush");
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
