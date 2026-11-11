package Lec_17;
import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String ques ="239";
		List<String> ll=new ArrayList<>();
		Letter_Combinations(ques,"", ll );
		System.out.println(ll);
		// TODO Auto-generated method stub

	}
	public static void Letter_Combinations(String ques, String ans,List<String> ll) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch= ques.charAt(0);
		String s=key[ch-'0'];
		for(int i=0; i<s.length(); i++) {
			Letter_Combinations(ques.substring(1), ans+s.charAt(i), ll);
		}
	}

}
