package Lec_8;

public class maximum_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,6,2,4,16,7,8,9};
	
		System.out.println(Maximum(arr));
		

	}
	public static int Maximum2(int[]arr) {
		int max=Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++) {
			max= Math.max(arr[i], max);
			}
		}
		return max;
	}

	public static int Maximum(int[]arr) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
