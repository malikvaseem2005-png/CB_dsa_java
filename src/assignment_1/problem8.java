package assignment_1;

import java.util.Scanner;

public class problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int star = n;
		int space = -1;
		int row = 1;
		
		while (row <= 2*n-1) {
			int i = 1;

			while (i <= star) {
				System.out.print("\t*");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;

			}
			int k = 1;
			if (row == 1 || row == 2*n-1) {
				k = 2;
			}

			while (k <= star) {
				System.out.print("\t*");
				k++;

			}
			if (row < n) {
				star--;
				if(row==1) {
				space =1;

			} else {
				
				space += 2;

			}
			}else {
				star++;
				space-=2;
			}
			System.out.println();
			row++;
		}

		// TODO Auto-generated method stub

	}

}
