package Lec_14;

public class Sub_string {

	public static void main(String[] args) {
		String s="coding";
		System.out.println(s.substring(2,4));
		substring(s);
		// TODO Auto-generated method stub

	}
	public static void substring(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
