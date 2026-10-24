package lec_15;

public class First_0cc {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,4};
		int item=4;
		System.out.println(Index(arr, item, 0));
		// TODO Auto-generated method stub

	}
	public static int Index(int [] arr, int item, int i) {
		if(arr[i]==item) {
			return i;
		}
		return Index(arr, item, i+1);
	}

}
