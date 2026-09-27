package Lec_8;

public class Linear_search {

	public static void main(String[] args) {
		int[] arr= {3,5,6,2,4,16,7,8,9};
		int item= 5;
		System.out.println(Search(arr,item));
		 
		}
		// TODO Auto-generated method stub

	
	public static int Search(int[] arr, int item) {
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
		
	}

}
