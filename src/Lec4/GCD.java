package Lec4;

public class GCD {

	public static void main(String[] args) {
		int div=36;
		int dividend=60;
		int rem=0;
		for(;dividend%div!=0;) {
			rem=dividend%div;
			dividend=div;
			div=rem;
		}
		System.out.println(div);
		// TODO Auto-generated method stub

	}

}
