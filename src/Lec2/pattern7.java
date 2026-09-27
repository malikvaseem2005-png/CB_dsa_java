package Lec2;

public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=n;
		int space=n-1;
		while(row<=n) {
			
			int i=1;
			if(i==1 || i==n) {
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			}
			else {
				int j=1;
				while(j<=space) {
					if(j==1 || j==n) {
						System.out.print("* ");
						
					}
					else {
						System.out.print(" ");
					}
				}
					
				}
				
			}
			System.out.println("");
			row++;
			
			star++;
			
		
		}
		// TODO Auto-generated method stub

	}
		
		// TODO Auto-generated method stub

	


