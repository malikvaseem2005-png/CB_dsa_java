package class_test;

public class question2 {

	public static void main(String[] args) {
		int n=4;
		int space=n-1;
		int star=1;
		int row=1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			
				}
			int j=1;
			char val='A';
			while(j<=star) {
				System.out.print(val+" ");
				if(j<star/2+1) {
					val++;
				}else {
					val--;
				}
				j++;
			}
				
			
			System.out.println();
			row++;
			star+=2;
			space--;
		}
			
			
			}
		
		// TODO Auto-generated method stub

	}


