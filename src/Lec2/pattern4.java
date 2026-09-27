package Lec2;

public class pattern4 {

	public static void main(String[] args) {
		int n=7;
		int Row=1;
		int star=1;
		int space=n;
       while(Row<=n) {
//    	   space
   	   
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				}
//			star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
				}
//			next row ki prepration
			System.out.println();
			Row++;
			space--;
			star++;
			
		
			
		
		}
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

	}

}
