package lec_16;

public class print_subsequnce {

	public static void main(String[] args) {
		String ques ="abc";
		print(ques,"");
		// TODO Auto-generated method stub

	}
	public static void print(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		print(ques.substring(1), ans);
		print(ques.substring(1),ans+ch);
	}

}
