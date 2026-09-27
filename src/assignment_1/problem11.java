package assignment_1;

import java.util.Scanner;

public class problem11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-1;
		while(row<=2*n+1) {
			//star
			int i=1;
			int val=n;
			while(i<=star) {
				System.out.print(val+" ");
				val--;
				i++;
				}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			val++;
			if(row==n+1) {
				k=2;
				
				val++;
				
			}
			while(k<=star) {
				System.out.print(val+" ");
				val++;
				k++;
			}
			if(row<=n) {
				star++;
				space-=2;
			}else {
				star--;
				space+=2;
				
			}
			
			//new row
			System.out.println();
			row++;
		}
		// TODO Auto-generated method stub

	}

}
