package Lec2;

public class pattern24 {

	public static void main(String[] args) {
		int n=5;
		int Row=1;
		int star=1;
		int space=n-1;
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
			star+=2;
       }
			
		
			
		// TODO Auto-generated method stub

	}

}
