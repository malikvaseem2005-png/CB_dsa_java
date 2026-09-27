package Lec2;

public class pattern15 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=n;
		int space=0;
		while(row<=2*n-1) {
			while(row<=2*n-1) {			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
				}
			if(row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
				
			}
			System.out.println();
			row++;
		// TODO Auto-generated method stub

	}

	}
}
