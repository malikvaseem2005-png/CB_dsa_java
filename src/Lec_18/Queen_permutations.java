package Lec_18;

public class Queen_permutations {

	public static void main(String[] args) {
		int n=4;
		boolean[] board=new boolean[n];
		int tq=2;
		Permutation(board,tq,"",0, );
		
		// TODO Auto-generated method stub

	}
	public static void Permutation(boolean[] board, int tq, String ans,int qpsf, ) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				Permutation(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i]=false;
			}
		}
	}

}
