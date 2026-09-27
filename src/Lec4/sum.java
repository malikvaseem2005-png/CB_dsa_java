package Lec4;

public class sum {

	public static void main(String[] args) {
		int n=567;
		int sum=0;
		for(; n>0;) {
			int rem=n%10;
			 sum= sum+rem;
			 n=n/10;
		}
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
