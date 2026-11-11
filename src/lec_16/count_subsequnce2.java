package lec_16;

public class count_subsequnce2{

	public static void main(String[] args) {
		String ques ="abc";
		
		System.out.println("\n"+print(ques));
		// TODO Auto-generated method stub

	}
	 
	 
	public static void print(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			
			return 1;
		}
		char ch=ques.charAt(0);
		int x= print(ques.substring(1), ans);
		int y=print(ques.substring(1),ans+ch);
		return x+y;
	}
	 //static int c=0;
	 
		//public static void print(String ques, String ans) {
		//	if(ques.length()==0) {
		//		System.out.println(ans + " ");
		//		c++;
		//		return;
		//	}
		//	char ch=ques.charAt(0);
		//	print(ques.substring(1), ans);
		//	print(ques.substring(1),ans+ch);

}
