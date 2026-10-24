package lec_15;

public class Sum_of_n_number {

	public static void main(String[] args) {
		int n=5;
		System.out.println(sum(n));
		// TODO Auto-generated method stub

	}
	public static int sum( int n) {
		if(n==0) {
			return 0;
		}
		int s=sum(n-1);
		return s+n;
	}

}
