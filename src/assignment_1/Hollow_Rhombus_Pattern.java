package assignment_1;
import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		
		while (row <= n) {
			// 1. Print leading spaces (N - row spaces)
			int csp = 1;
			int totalSpaces = n - row;
			while (csp <= totalSpaces) {
				System.out.print(" ");
				csp++;
			}
			
			// 2. Print stars and hollow spaces for the row
			if (row == 1 || row == n) {
				// For the first and last row, print 'n' stars
				int cst = 1;
				while (cst <= n) {
					System.out.print("*");
					cst++;
				}
			} else {
				// For middle rows: 1 star, (n - 2) spaces, 1 star
				System.out.print("*");
				
				int cin = 1;
				while (cin <= n - 2) {
					System.out.print(" ");
					cin++;
				}
				
				System.out.print("*");
			}
			
			row++;
			System.out.println();
		}
		
	
	}
		// TODO Auto-generated method stub

	}


