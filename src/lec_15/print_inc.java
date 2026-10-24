package lec_15;

public class print_inc {

	public static void main(String[] args) {
		int n=5;
		PI(n);
		
		// TODO Auto-generated method stub

	}
	public static void PI(int n) {
		if(n==0) {
			return ;0
		}
		PI(n-1);
		System.out.print(n);
	}

}
