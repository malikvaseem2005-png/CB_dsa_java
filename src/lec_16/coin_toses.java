package lec_16;

public class coin_toses {

	public static void main(String[] args) {
	int n=3;
	toss(n,"");
		// TODO Auto-generated method stub

	}
	public static void toss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss(n-1,ans+"H");
		toss(n-1,ans+"T");
	}

}
