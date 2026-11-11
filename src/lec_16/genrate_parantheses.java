package lec_16;
import java.util.*;

public class genrate_parantheses {

	public static void main(String[] args) {
		int n=3;
		List<String> ll=new ArrayList<>();
		parentheses(n,0,0,"",ll);
		// TODO Auto-generated method stub

	}
	public static void parentheses(int n, int open, int closed, String ans , List<String>ll) {
		if(open==n&& closed==n) {
			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n|| closed>open) {
			return;
		}
		parentheses(n,open+1,closed,ans+"(",ll);
		parentheses(n,open,closed+1,ans+")", ll);
	}

}
