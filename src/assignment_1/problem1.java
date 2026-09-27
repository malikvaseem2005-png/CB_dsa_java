package assignment_1;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
		
			while(i<=star) {
				if(i==1 ||i==star) {
				System.out.print(row+"\t");
				}else {
					System.out.print(0+"\t");
					
				}
				
				i++;
				}
			row++;
			star++;
			System.out.println("");
			
		
		}
		
	}

}
