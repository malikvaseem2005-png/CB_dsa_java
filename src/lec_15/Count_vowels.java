package lec_15;

public class Count_vowels {

	public static void main(String[] args) {
		String s="coding";
		System.out.println(countVowels1(s ,0));
		// TODO Auto-generated method stub

	}
	public static int countVowels1(String s ,int i) {
		if(s.length()==i) {
			return 0;
		}
	char ch=s.charAt(i);
	int c=0;
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
		c=1;
	}
	return c+countVowels1(s , i+1);
	}
	public static int countVowels(String s) {
		if(s.length()==0) {
			return 0;
		}
	char ch=s.charAt(0);
	int c=0;
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
		c=1;
	}
	return c+countVowels(s.substring(1));
	}

}
