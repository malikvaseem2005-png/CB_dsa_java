package assignment_1;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int Row=1;
		int star=1;
		int space=n/2;
       while(Row<=n) {
//    	   space
   	   
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
				}
//			star
			int j=1;
			while(j<=star) {
				System.out.print("*\t");
				j++;
				}
			if(Row<=n/2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
//			next row ki prepration
			System.out.println();
			Row++;
			
			
		
			
		
		}
		// TODO Auto-generated method stub

	}

}
