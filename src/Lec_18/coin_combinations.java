package Lec_18;

public class coin_combinations {

	public static void main(String[] args) {
		int [] coins= {2,3,1,5};
		int amount=5;
		Permutation(coins,amount,"");
		
		// TODO Auto-generated method stub

	}
	public static void Permutation(int[] coins,int amount,String ans ) {
		if(	amount==0) {
			System.out.println(ans);
			return;
		}
				for(int i=0; i<coins.length;i++) {
			if(amount>=coins[i]) {
				Permutation(coins,amount-coins[i],ans+coins[i]);
			}
			
		}
	}

}
