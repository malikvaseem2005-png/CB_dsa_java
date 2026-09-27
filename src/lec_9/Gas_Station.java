package lec_9;

public class Gas_Station {

	public static void main(String[] args) {
		int[] gas = {1,2,3,4,5} ,cost= {3,4,5,1,2};
	    System.out.println(CompleteCircle(gas,cost));
		// TODO Auto-generated method stub

	}
	public static int CompleteCircle(int[] gas, int[] cost) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i= 0; i<cost.length; i++) {
			sum1=sum1+gas[i];
			sum2=sum2+cost[i];
			
		}
		if(sum1-sum2<0) {
			return -1;
		}
		int ts=0;
		int idx=0;
		for(int i=0; i<cost.length; i++) {
			ts=ts+(gas[i]-cost[i]);
			if(ts<0) {
				idx=i+1;
				ts=0;
			}
		}
		return idx;
		
	}

}
