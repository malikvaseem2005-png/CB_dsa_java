package Lec_11;

public class Binary_search {

	public static void main(String[] args) {
		int []arr= {2,3,5,7,8,11,13,19,20};
		int item=11;
		System.out.println(Search(arr,item));
		
		// TODO Auto-generated method stub

	}
	public static int Search(int[]arr, int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid =(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
