package Lec_10;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr= {1,2,7,8,9,11,4};
		int[]arr= {8,9,1,7,4,2,11};
		sort(arr);
		//InsertLastElement(arr, arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");	
		}

	}
	public static void sort(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			InsertLastElement(arr,i);
		}
	}
	public static void InsertLastElement(int[] arr,int i) {
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			arr[j]=item;
			j--;
		}
		// corret index ke liye j+1 return kar do
		
	}

}
