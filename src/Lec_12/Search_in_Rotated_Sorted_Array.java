package Lec_12;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		
		int [] arr= {4,5,6,7,0,1,2};
		int target = 0;
		System.out.print(Search(arr,target));
		
	}
	public static int Search(int [] arr, int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid= (lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[lo]<=arr[mid]) {//upper line pe hu
				if(arr[lo]<=target&& arr[mid]>target) {
					hi=mid-1;
				}
				else {
					lo=mid+1;
				}
			}
			else {
				//lower line per hu
				if(arr[hi]>=target&& arr[mid]<target) {
					hi=mid+1;
				}
				else {
					lo=mid-1;
				}
				
			}
		}
		return -1;
	}

}
