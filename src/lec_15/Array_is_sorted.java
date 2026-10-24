package lec_15;

public class Array_is_sorted {

	public static void main(String[] args) {
		int[] arr= {3,5,7,8,9};
		System.out.println(isSorted(arr, 0));
		// TODO Auto-generated method stub

	}
	public static boolean isSorted(int[] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return isSorted(arr ,i+1);
		
	}

}
