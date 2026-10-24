package lec_15;

public class Fact_tail {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n,1));
		// TODO Auto-generated method stub

	}
	public static int fac(int n ,int ans) {
		if(n==0) {
			return ans;
		}
		return fac(n-1, ans*n);
		// TODO Auto-generated method stub

	}

}
