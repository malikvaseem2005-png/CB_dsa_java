package class_test;

public class question3 {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=2*n-3;
		int row=1;
		while(row<=n) {
			char val='A';
			int i=1;
			while(i<=star) {
				System.out.print(val+" ");
				i++;
				val++;
			}
			int j=1;
			int p=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			
		}
			
			int k=1;
			val--;
			if(row==n) {
				val--;
				k=2;
			}
			while(k<=star) {
				System.out.print(val+" ");
				val--;
				k++;
			}
		// TODO Auto-generated method stub
				System.out.println();
				row++;
				star++;
				space-=2;
			
	}

}
}
