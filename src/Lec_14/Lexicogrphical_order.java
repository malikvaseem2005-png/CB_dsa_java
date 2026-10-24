package Lec_14;

public class Lexicogrphical_order {

	public static void main(String[] args) {
		String s1="kunal";
		String s2="komal";
		System.out.println(s1.compareTo(s2));
		String s3="ankita";
		String s4="ankit";
		System.out.println(s4.compareTo(s3));
		// TODO Auto-generated method stub

	}
	public static int compareTo(String s1,String s2) {
		if(s1==s2) {
			return 0;
			
		}
		int n=Math.min(s1.length(),s2.length());
		for(int i=0; i<n; i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
				
			}
		}
		return s1.charAt()-s2.charAt();
	}

}
