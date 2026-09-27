package Lec2;

public class pattern13 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=1;
		while(row<=2*n-1) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
				}
			//mirror
			if(row<n) {
				star++;
			}else {
				star--;
				
			}
			
			//new row
			System.out.println();
			row++;
		}
		// TODO Auto-generated method stub

	}

}
