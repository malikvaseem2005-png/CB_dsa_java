package assignment_1;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-3;
		while(row<=n) {
//			star
			int i=1;
			int val=1;
			while(i<=star) {
				System.out.print(val+"\t");
				val++;
				i++;
				
			}
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
				
			}
			int k=1;
			val=row;
			if(row==n) {
				k=2;
				val=row-1;
				}
			while(k<=star) {
				System.out.print(val+"\t");
				val--;
				k++;
			}
			System.out.println();
			row++;
			star++;
			space-=2;
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
