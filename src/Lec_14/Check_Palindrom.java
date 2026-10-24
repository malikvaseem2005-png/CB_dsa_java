
package Lec_14;

public class Check_Palindrom {

	
	public static void main(String[] args) {
		String s="nitin";
		System.out.println(Is_palindromic(s));
		// TODO Auto-generated method stub

	}
	public static boolean Is_palindromic(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
