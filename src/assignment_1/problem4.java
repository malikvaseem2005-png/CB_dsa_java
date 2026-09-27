package assignment_1;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int Row=1;
		int star=1;
		int space=n-1;
	
		
       while(Row<=n) {
//    	   space
   	   
			int i=1;
		
			while(i<=space) {
				System.out.print("\t");
				i++;
				}
//			star
			int j=1;
			int val =Row;
			while(j<=star) {
				System.out.print(val+"\t");
				if(j<=star/2) {
					val++;
				}else {
					val--;
				}
			
		
				j++;
				
			}
		
//			next row ki prepration
			System.out.println();
			Row++;
			space--;
			star+=2;
			
		
			
		
		}
		
	

	}

}
