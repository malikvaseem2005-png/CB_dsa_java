package Lec_11;

import java.util.*;

public class Aggressive_Cows {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0) {
		int nos=sc.nextInt();
		int noc=sc.nextInt();
		int[] stall = new int [nos];
		for(int i=0; i<stall.length; i++) {
			stall[i]=sc.nextInt();
			
		}
		Arrays.sort(stall);
		System.out.println(largest_minimum(stall, noc));
		}
			
		
		
		// TODO Auto-generated method stub

	}
	public static int largest_minimum(int[] stall, int noc) {
		int n=stall.length-1;
		int lo=0;
		int hi=stall[n-1]-stall[0];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc,mid)) {
				ans=mid;
				lo=mid+1;
				
			}else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] stall,int noc,int mid) {
		int pos=stall[0];
		int c=1;
		for(int i=1; i<stall.length; i++) {
			if(stall[i]-pos>=mid) {
				pos=stall[i];
				c++;
			}
			if(c==noc) {
				return true;
			}
		}
		return false;
	}

}
