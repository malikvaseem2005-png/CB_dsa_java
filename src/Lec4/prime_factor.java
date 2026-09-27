package Lec4;

public class prime_factor {

	public static void main(String[] args) {
		int n=378;
		for(int i=2; n>1;) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			else {
				i++;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
