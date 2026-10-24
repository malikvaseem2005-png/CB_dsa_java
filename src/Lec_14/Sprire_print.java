package Lec_14;

public class Sprire_print {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, 
		                   { 2, 5, 8, 12, 19 }, 
		                   { 3, 6, 9, 16, 22 }, 
		                   { 10, 13, 14, 17, 24 },
	                   	{ 18, 21, 23, 26, 30 } };
		// TODO Auto-generated method stub

	}
	public static void print (int [][]arr) {
		int minr=0 , minc=0,maxr=arr.length-1,maxc=arr.length-1;
		int te=arr.length * arr[0].length;
		int c=0;
		while(c<te) {
		for (int i=minc; i<=maxc && c<te;i++) {
			c++;
			System.out.print(arr[minr][i]+" ");
		}
		minr++;
		for(int i=minr; i<=maxr && c<te; i++) {
			c++;
			System.out.print(arr[i][maxc]+" ");
		}
		maxc--;
		for(int i=maxc;i>=minc && c<te;i--) {
			c++;
			System.out.print(arr[maxr][i]+" ");
		}
		maxr--;
		for(int i=maxr; i>=minr && c<te; i--) {
			c++;
			System.out.print(arr[i][minc]+" ");
		}
		minc++;
		
		}
	}
	
	}


