package Lec_18;

public class coin_permutations {

	public static void main(String[] args) {
		int [] coins= {2,3,1,5};
		int amount=5;
		combination(coins,amount,"",0);
		
		// TODO Auto-generated method stub

	}
	public static void combination(int[] coins,int amount,String ans,int idx ) {
		if(	amount==0) {
			System.out.println(ans);
			return;
		}
				for(int i=idx; i<coins.length;i++) {
			if(amount>=coins[i]) {
				combination(coins,amount-coins[i],ans+coins[i],i);
			}
			
		}
	}

}
