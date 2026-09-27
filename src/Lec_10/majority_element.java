package Lec_10;

public class majority_element {

	public static void main(String[] args) {
		int[]arr= {2,2,1,1,1,2,2};
		System.out.print(MooreVoting(arr));
		// TODO Auto-generated method stub

	}
	public static int MooreVoting(int[]arr) {
		int e=arr[0];
		int vote=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==e) {
				vote++;
			}
				else {
					vote--;
				}
			if(vote==0) {
				vote=1;
				e=arr[i];
			}
			
		}
		return e;
	}
}
