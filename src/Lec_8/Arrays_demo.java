package Lec_8;

public class Arrays_demo {

	public static void main(String[] args) {
		int[] arr =new int[5];
		System.out.println(arr);
		System.out.println(arr.length);
		int[] other = arr;
		//set
		arr[0] = 10;
		arr[1] = 4;
		arr[2] = 5;
		arr[3] = -4;
		arr[4] = 9;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// TODO Auto-generated method stub

	}

}
