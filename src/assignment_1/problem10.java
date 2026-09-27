package assignment_1;

import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=0;
		int star=1;
		
		while(row<=n) {
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+"\t");
				ncr= ncr*(row-i)/(i+1);
				i++;
				}
			row++;
			star++;
			System.out.println("");
			
		
		}
		// TODO Auto-generated method stub

	}

}

		// TODO Auto-generated method stub

	


