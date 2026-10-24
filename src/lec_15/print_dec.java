package lec_15;

public class print_dec {

	public static void main(String[] args) {
		int n=5;
		Pd(n);
		
		// TODO Auto-generated method stub

	}
	public static void Pd(int n) {
		if(n==0) {
			return ;
		}
		
		System.out.println(n);
		Pd(n-1);
	}

}
		// TODO Auto-generated method stub

	


