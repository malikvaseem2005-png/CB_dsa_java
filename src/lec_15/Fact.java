package lec_15;

public class Fact {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
		// TODO Auto-generated method stub

	}
	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		int f =fac(n-1);//sp
		return f*n;
	}

}
